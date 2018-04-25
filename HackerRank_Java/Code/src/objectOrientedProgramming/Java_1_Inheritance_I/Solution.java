package objectOrientedProgramming.Java_1_Inheritance_I;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

// my code
class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}

// end my code

public class Solution {

	public static void main(String args[]) {

		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

	}
}