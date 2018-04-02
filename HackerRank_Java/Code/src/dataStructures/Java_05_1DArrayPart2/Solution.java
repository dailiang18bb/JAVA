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

		if (k < 0 || game[k] == 1) {
			return false;
		}
		if (k == game.length - 1 || k + leap > game.length - 1) {
			return true;
		}

		game[k] = 1;

		return leapJump(k + 1, leap, game) || leapJump(k - 1, leap, game) || leapJump(k + leap, leap, game);
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


/**
 * DFS great solution
 */
// private static boolean isSolvable(int m, int[] arr, int i) {
// if (i < 0 || arr[i] == 1) return false;
// if ((i == arr.length - 1) || i + m > arr.length - 1) return true;
//
// arr[i] = 1;
// return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) ||
// isSolvable(m, arr, i + m);
// }
