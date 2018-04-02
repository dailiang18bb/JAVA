package dataStructures.Java_03_Subarray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	//method to sum the arr
	private static int sumArr(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum = sum + num;
		}
		return sum;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		
		int countNegativeSum = 0;
		int[] tempArr = new int[n];

		for (int i = 0; i < n + 1; i++) {
			for (int j = i + 1; j < n + 1; j++) {
				tempArr = Arrays.copyOfRange(arr, i, j);
				countNegativeSum = sumArr(tempArr) < 0 ? countNegativeSum + 1 : countNegativeSum;
			}
		}
		System.out.println(countNegativeSum);
		
	}
}