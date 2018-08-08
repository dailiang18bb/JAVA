package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlayGround_012 {

	public static int reverse(int x) {
		int result = 0;
		char[] ch = String.valueOf(x).toCharArray();
		if (x >= 0) {
			for (int i = 0; i < ch.length; i++) {
				try {
					int y = Math.multiplyExact(Character.getNumericValue(ch[i]),(int) Math.pow(10, i));
					result = Math.addExact(result, y);
				} catch (ArithmeticException e) {
					return 0;
				}
			}
		} else {
			for (int i = 1; i < ch.length; i++) {
				try {
					int y = Math.multiplyExact(Character.getNumericValue(ch[i]),(int) Math.pow(10, i - 1));
					result = Math.subtractExact(result, y);
				} catch (ArithmeticException e) {
					return 0;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int S = in.nextInt();
		System.out.println(reverse(S));

	}
}
