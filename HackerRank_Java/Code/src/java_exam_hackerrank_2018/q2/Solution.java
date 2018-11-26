package java_exam_hackerrank_2018.q2;

import java.util.*;

class MyCalculator {

	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}

		return (p == 0) ? 1 : n * power(n, p - 1);
	}
}

class Solution {

	public static void main(String[] args) {
		// Write your code here.
		MyCalculator myCalculator = new MyCalculator();
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			int p = scanner.nextInt();
			try {
				System.out.println(myCalculator.power(n, p));

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("java.lang.Exception: " + e.getMessage());
			}

		}

	}
}
