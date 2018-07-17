package exceptionHandling.Java_Exception_Handling;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = x / y;
			System.out.println(c);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
			System.out.println("java.util.InputMismatchException");

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
	
	
	
	
	
	//Exception Handling
	
	/**
	 * Scanner.nextInt()
	 * 
	 * @throws InputMismatchException
	 *         if the next token does not match the <i>Integer</i>
	 *         regular expression, or is out of range
	 * @throws NoSuchElementException if input is exhausted
	 * @throws IllegalStateException if this scanner is closed
	 * @throws IllegalArgumentException if the radix is out of range         
	 *          
	 *          
	 */

}