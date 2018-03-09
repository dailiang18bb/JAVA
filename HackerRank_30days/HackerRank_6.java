
//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {

	Scanner in = new Scanner(System.in);
	int t;
	String[] s = new String[10];

	public void setT(int n) {
		this.t = n;
	}

	public void setS(String b, int i) {
		s[i] = b;
	}

	public void doget() {
		setT(Integer.parseInt(in.nextLine()));
		for (int i = 0; i < this.t; i++) {
			setS(in.nextLine(), i);
		}
		// System.out.print(t);
		// System.out.print(s[0]);
	}

	public void dopost() {
		for (int i = 0; i < t; i++) {
			char[] s1 = s[i].toCharArray();
			for (int j = 0; j < s1.length; j += 2) {
				System.out.print(s1[j]);
			}
			System.out.print(" ");
			for (int k = 1; k < s1.length; k += 2) {
				System.out.print(s1[k]);
			}
			System.out.println("");

		}
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Solution go = new Solution();
		go.doget();
		go.dopost();
	}
}
