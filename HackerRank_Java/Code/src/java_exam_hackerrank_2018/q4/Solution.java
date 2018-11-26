package java_exam_hackerrank_2018.q4;

import java.util.Scanner;

abstract class Arithmetic {
	abstract int add(int a, int b);
}

/*
 * Write the Adder class here. Do not use an access modifier at the beginning of
 * your class declaration.
 */

// Write your code here

class Adder extends Arithmetic {
	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		Adder adderObject = new Adder();

		System.out.println(adderObject.getClass().getSuperclass().getName());
		System.out.print(adderObject.add(a, b));
	}
}