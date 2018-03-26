package strings.Java_11_TagContentExtractor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		// Problem Setter's code:
		// String pattern = "<([^>]+)>([^<>]+)</\\1>";
		// My code:
		String regex = "<(.+)>([^<]+)<\\/\\1>";
		Pattern p = Pattern.compile(regex);

		while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			Matcher m = p.matcher(line);
			if (m.find()) {
				do {
					System.out.println(m.group(2));
				} while (m.find());
			} else {
				System.out.println("None");
			}
			testCases--;
		}
	}
}
