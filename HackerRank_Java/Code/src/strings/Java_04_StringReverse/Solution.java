package strings.Java_04_StringReverse;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		// since Java 1.5 use StringBuilder
		System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
		// before Java 1.5 use StringBuffer
		System.out.println(A.equals(new StringBuffer(A).reverse().toString()) ? "Yes" : "No");

	}
}
