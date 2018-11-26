package implementation.BetweenTwoSets;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

	/*
	 * Complete the getTotalX function below.
	 */
	static int getTotalX(int[] a, int[] b) {
		/*
		 * Write your code here.
		 */
		Arrays.sort(a);
		Arrays.sort(b);
		int aMax = a[a.length - 1];
		int bMin = b[0];
		int result = 0;
//        List<Integer> mm = new ArrayList<>();

		for (int i = aMax; i <= bMin; i++) {
			boolean flag = true;
			for (int j = 0; j < a.length; j++) {
				if (i % a[j] != 0) {
					flag = false;
					break;
				}
			}

			for (int k = 0; k < b.length; k++) {
				if (!flag) {
					break;
				}
				if (b[k] % i != 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
//            	mm.add(i);
				result++;
			}
		}
//        for(int x : mm) {
//        	System.out.println(x);
//        }
		return result;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scan.nextLine().split(" ");

		int n = Integer.parseInt(nm[0].trim());

		int m = Integer.parseInt(nm[1].trim());

		int[] a = new int[n];

		String[] aItems = scan.nextLine().split(" ");

		for (int aItr = 0; aItr < n; aItr++) {
			int aItem = Integer.parseInt(aItems[aItr].trim());
			a[aItr] = aItem;
		}

		int[] b = new int[m];

		String[] bItems = scan.nextLine().split(" ");

		for (int bItr = 0; bItr < m; bItr++) {
			int bItem = Integer.parseInt(bItems[bItr].trim());
			b[bItr] = bItem;
		}

		int total = getTotalX(a, b);

		System.out.println(total);

//        bw.write(String.valueOf(total));
//        bw.newLine();
//
//        bw.close();
	}
}
