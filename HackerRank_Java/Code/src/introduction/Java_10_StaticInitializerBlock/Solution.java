package introduction.Java_10_StaticInitializerBlock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// Write your code here
	static boolean flag = true;
	static int B, H;
	static {
		Scanner in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();
		in.close();
		try {
			if (B <= 0 || H <= 0) {
				flag = false; // alternative option with System.exit(0);
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
			// System.exit(0);
		}
	}
	// end my code here
	
	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class

/**
 * 
 * Solution 2
 */

/*
static int B, H;
static boolean flag = true;
static {

 Scanner sc = new Scanner(System.in);
 B = sc.nextInt();
 H = sc.nextInt();
 sc.close();
 try {
  if (B <= 0 || H <= 0)
   throw new Exception("Breadth and height must be positive");
 } catch (Exception e) {
  System.out.println(e);
  System.exit(0);
 }

}*/