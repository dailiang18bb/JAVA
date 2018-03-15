package strings.Java_03_SubstringComparisons;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'
		int j = k + 1;
		int g = k + 1;

		for (int i = 1; i <= s.length() - k; i++) {
			if (smallest.compareTo(s.substring(i, j)) > 0) {
				smallest = s.substring(i, j);
			}
			j++;
		}

		for (int i = 1; i <= s.length() - k; i++) {
			if (largest.compareTo(s.substring(i, g)) < 0) {
				largest = s.substring(i, g);
			}
			g++;
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}

// Great solution
/*
public static void main(String[] args) {
     Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
    Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int k=scan.nextInt();
    SortedSet<String> sets=new TreeSet<String>();
    for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());
}
*/

// Great solution2
/*
public static String getSmallestAndLargestList(String s, int k) {
    Vector<String> substrings = new Vector<String>();
    
    for (int i = 0; i <= s.length() - k; i++) {
        // Add a substring of length 'k' to our list
        substrings.add( s.substring(i, i + k) );	
    }
    
    // Sort list
    Collections.sort(substrings);
    
    // Set first and last elements as smallest and largest
    String smallest = substrings.get(0);
    String largest = substrings.get(substrings.size() - 1);
    
    return smallest + "\n" + largest;
}
*/