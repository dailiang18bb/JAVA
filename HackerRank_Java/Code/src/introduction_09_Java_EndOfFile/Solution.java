package introduction_09_Java_EndOfFile;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int i = 1;
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			System.out.println(i++ + " " + in.nextLine());
		}
		in.close();
	}
}

/**
 * 
 * Solution 2
 */
/*
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext())
        	System.out.println(++line_num + " " + sc.nextLine());
        sc.close();

    }
}

*/

/**
 * 
 * Solution 3
 */


/*
//For loop 
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
for(int i = 1; scan.hasNext()== true; i++){
    System.out.println(i + " " + scan.nextLine());
}
}

//While loop System
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i = 0;
while(scan.hasNext()){
    i++;
    System.out.println(i + " " + scan.nextLine());
}
}
*/

