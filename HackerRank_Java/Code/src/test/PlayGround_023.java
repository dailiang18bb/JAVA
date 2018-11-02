package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlayGround_023 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// Write Your Code Here
		bubbleSort(n, a);
	}

	static void bubbleSort(int n, int[] a) {
		int numberSwap = 0;
		for (int i = n; i > 0; i--) {
			int jumpOutFlag = 0;
			for (int j = 0; j < i - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j);
					numberSwap++;
					jumpOutFlag++;
				}
			}
			if (jumpOutFlag == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + numberSwap + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}

	static int[] swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
		return arr;
	}
}