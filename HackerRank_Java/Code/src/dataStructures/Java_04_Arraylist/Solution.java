package dataStructures.Java_04_Arraylist;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int numList = in.nextInt();

		ArrayList<ArrayList> list2d = new ArrayList<ArrayList>();

		for (int j = 0; j < numList; j++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int elementsList = in.nextInt();
			for (int i = 0; i < elementsList; i++) {
				list.add(in.nextInt());
			}
			list2d.add(list);
		}

		int numQuestion = in.nextInt();

		for (int i = 0; i < numQuestion; i++) {

			int line = in.nextInt();
			int row = in.nextInt();
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			tempList = list2d.get(line - 1);
			try {
				System.out.println(tempList.get(row - 1));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR!");
			}
		}
		in.close();

	}
}