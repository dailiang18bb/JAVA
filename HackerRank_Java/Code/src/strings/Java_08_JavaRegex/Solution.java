package strings.Java_08_JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
			// IP.matches
		}
	}
}

// Write your code here

class MyRegex {
	
	String pattern = "(([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(25[0-5]|[0-1]?\\d\\d?|2[0-4]\\d|25[0-5])";
	
}

