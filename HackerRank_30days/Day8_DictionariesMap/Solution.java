
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {

	private static Map<String, Integer> phoneBook = new HashMap<>();

	public static void printName(String name) {
		if (phoneBook.containsKey(name)) {
			System.out.println(name + "=" + phoneBook.get(name));
		} else {
			System.out.println("Not found");
		}
	}

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			printName(s);
		}
		in.close();
	}
}