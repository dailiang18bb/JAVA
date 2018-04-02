package dataStructures.Java_05_1DArrayPart2;

import java.util.*;

public class Solution {

	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.

		// when leap = 0|1
		if (leap <= 1) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 1) {
					return false;
				}
			}
			return true;
		} else {
			if (leapJump(0, leap, game)) {
				return true;
			} else {
				return false;
			}

		}
	}

	// when leap >= 2
	public static boolean leapJump(int k, int leap, int[] game) {

		int[] subLeap = new int[leap];
		boolean flag = false;

		if (k == game.length - 1 || k + leap >= game.length - 1) {
			return true;
		}

		for (int i = k; i < game.length; i++) {
			if ((i + leap - 1) >= game.length) {
				return true;
			} else {
				subLeap = Arrays.copyOfRange(game, i, i + leap + 1);
				flag = (subLeap[0] == 0 && subLeap[leap] == 0) ? true : false;
				if (flag) {
					if (leapJump(i + leap, leap, game)) {
						return true;
					}
				} else if (subLeap[0] == 1 && subLeap[subLeap.length - 2] == 1) {
					break;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
