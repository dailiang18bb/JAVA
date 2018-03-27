package bigNumber.Java_01_BigInteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		in.close();
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
	}
}