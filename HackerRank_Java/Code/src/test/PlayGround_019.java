package test;

import java.util.Scanner;

public class PlayGround_019 {

	public static int reverseBits(int n) {
		String a = Integer.toBinaryString(n);
		String output = String.format("%32s", a).replace(' ', '0');
		char[] ch = output.toCharArray();
		String b = new String(arrayReverse(ch));
		long result = Long.parseLong(b, 2);
		return (int)result;
	}

	public static char[] arrayReverse(char[] arr) {
		if (arr == null) {
			return null;
		}

		char[] arrReverse = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrReverse[arr.length - 1 - i] = arr[i];
		}
		return arrReverse;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(reverseBits(n));

	}

}
