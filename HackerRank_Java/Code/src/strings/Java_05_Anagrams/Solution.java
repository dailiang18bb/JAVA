package strings.Java_05_Anagrams;

import java.io.*;
import java.util.*;

public class Solution {
	static boolean isAnagram(String a, String b) {
		// Complete the function
		char[] c = a.toLowerCase().toCharArray();
		char[] d = b.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);

		String f = new String(c);
		String g = new String(d);
		return (f.equals(g)) ? true : false;
		// end of my code
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}