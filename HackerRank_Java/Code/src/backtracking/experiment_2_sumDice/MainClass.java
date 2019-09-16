package backtracking.experiment_2_sumDice;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	private static int calls = 0;

	private static void sumDice(int numDice, int target) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		helper(numDice, res, path, target, 0);
		for (List x : res) {
			System.out.println(x);
		}
		System.out.println(calls);

	}

	private static void helper(int numDice, List res, List path, int tar, int sumSoFar) {
		if (numDice == 0) {
			res.add(new ArrayList<>(path));
		} else {
			calls++;
			for (int i = 1; i <= 6; i++) {
				if (sumSoFar + i + 1*(numDice - 1) <= tar &&
					sumSoFar + i + 6*(numDice - 1) >= tar) {
					// chose
					path.add(i);
					// explorer
					helper(numDice - 1, res, path, tar, sumSoFar + i);
					// back
					path.remove(path.size() - 1);
				}
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		sumDice(3, 7);
	}

}
