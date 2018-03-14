package strings.Java_01_StringsIntroduction;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0? "Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + 
                           B.substring(0, 1).toUpperCase()+ B.substring(1));
		}
}


/*
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();

		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));
	}}

	A better way using a seperate method for capitalization:`java

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
	}

public static String capitalizeFirstLetter(String original) {
if (original == null || original.length() == 0) {
    return original;
}
return original.substring(0, 1).toUpperCase() + original.substring(1);
}
*/