package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class temp {

	/**
	 * findConsecutiveNumber P,
	 * 
	 * @param n
	 *            the ArrayList
	 * @param p
	 *            the Consecutive number
	 * @return the max Consecutive number
	 */
	// n = [1,0,0,0,0,1,0,0]
	// p = 0
	// return 4;
	public static int findConsecutiveNumber(ArrayList<Integer> n, int p) {
		int maxLength = 0;
		int tempLength = 0;
		for (int i = 0; i < n.size(); i++) {
//			if (n.get(i) == p) {
//				tempLength++;
//			} else {
//				tempLength = 0;
//			}
			tempLength = (n.get(i) == p)? tempLength + 1 : 0;
			maxLength = (tempLength > maxLength) ? tempLength : maxLength;
		}
		return maxLength;
	}
	
	
	/**
	 * convert a base10 integer to a base2 ArrayList
	 * 
	 * @param n,
	 *            the base10 integer
	 * @return the base2 ArrayList
	 */
	// 7 --> 111
	public static ArrayList<Integer> base10ToBase2(int n) {
		ArrayList<Integer> b2ArrayList = new ArrayList();
		if (n == 0) {
			b2ArrayList.add(0);
		}
		while (n != 0) {
			b2ArrayList.add(n % 2);
			n = n / 2;
		}
		Collections.reverse(b2ArrayList);
		return b2ArrayList;
	}
	
	public static String base10ToBase2String(int n) {
		return Integer.toString(n, 2);
	}
	
	
	public static int findConsecutiveNumberByString(String strBinary, int p) {
		String REGAX_INITIATE = "[0123456789]";
		String Regex = REGAX_INITIATE.substring(0, p + 1) + REGAX_INITIATE.substring(p + 2);
		System.out.println(Regex);
		String[] strparts = strBinary.split(Regex);
		int maxLength = 0;
		for (int i = 0; i < strparts.length; i++) {
			if (maxLength < strparts[i].length()) {
				maxLength = strparts[i].length();
			}
		}
		return maxLength;
	}
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(findConsecutiveNumberByString("10101010100011110100101010013245802", 1));
		
	
		
		//System.out.println(strparts[5]);
//		String strBinary = Integer.toString(n, 2);
//		System.out.println(strBinary);
//		   // above is binary of given in in string
//		String[] strparts = strBinary.split("0");
//		for(String x: strparts) {
//			System.out.println(x);
//		}
	}
}