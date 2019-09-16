package backtracking.experiment_1_dice;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	
	public static void dice(int numDice) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		diceHelper(numDice, res, path);
//		System.out.println(res);
		for(List<Integer> x: res) {
			System.out.println(x);
		}
	}
	
	
	private static void diceHelper(int numDice, List<List<Integer>> res, List<Integer> path) {
		if (numDice == 0) {
//			System.out.println(path);
			res.add(new ArrayList(path));
//			System.out.println(res);
		}else {
			for(int i=1; i<= 6;i++) {
				// chose
				path.add(i);
				// exlpore
				diceHelper(numDice - 1, res, path);
				// backtracking
				path.remove(path.size()-1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		dice(2);
	}

}
