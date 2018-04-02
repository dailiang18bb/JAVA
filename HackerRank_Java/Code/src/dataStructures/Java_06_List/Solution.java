package dataStructures.Java_06_List;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int numElement = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numElement; i++) {
			list.add(in.nextInt());
		}
		int numQueries = in.nextInt();
		for (int j = 0; j < numQueries; j++) {
			
			if (in.next().equals("Insert")) {
				int n = in.nextInt();
				int m = in.nextInt();
				if(n>list.size()) {
					list.add(m);
				}else {
					list.add(n,m);
				}
			} else {
				list.remove(in.nextInt());
			}
		}
		in.close();
		for (Integer p : list) {
			System.out.print(p + " ");
		}
	}
}