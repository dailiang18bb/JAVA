package java_exam_hackerrank_2018.q5;

import java.util.regex.*;


import java.util.Scanner;

class MyRegex extends Solution {
	
	
	/**
	 * The IPv4 regex pattern string
	 */
    private static String pattern = "(([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(25[0-5]|[0-1]?\\d\\d?|2[0-4]\\d|25[0-5])";
    private String ip;
    
    public MyRegex(String iP) { 
        // Write your code here
    	this.ip = iP;
    }
    
    public boolean isMatch() {
        // Write your code here
    	return this.ip.matches(pattern);
    }
}


class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String iP = in.next();
            MyRegex mr = new MyRegex(iP);
			System.out.println(mr.isMatch());
		}
        in.close();
	}
}
