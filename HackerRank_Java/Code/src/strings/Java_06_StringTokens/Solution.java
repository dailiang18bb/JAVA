package strings.Java_06_StringTokens;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		scan.close();
		
		String a = s.trim();
		if (a.isEmpty()) {
			System.out.println("0");
		} else {
			String[] b = a.trim().split("[ !,?._'@]+");
			// String[] a = s.split("[^a-zA-Z]+");
			System.out.println(b.length);
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}

	}
}

/* Instructor solution
 * 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            
            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");
                
                // Print number of tokens
                System.out.println(strings.length);
                
                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
    }
}
*/


/* Tester code
 * 
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        scan.close();
        
        String[] tokens = input.split("[^\\p{Alpha}]+");
        
        int size = (input.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);
        
        for(String s : tokens) {
            System.out.println(s);
        }
    }
}

*/