package dataStructures.Java_08_Stack;

import java.util.*;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			Stack<Character> st = new Stack<Character>();

			for (int i = 0; i < input.length(); i++) {
				if (!st.empty()) {

					switch (input.charAt(i)) {
					case ']':
						if (st.peek().equals('['))
							st.pop();
						break;
					case '}':
						if (st.peek().equals('{'))
							st.pop();
						break;
					case ')':
						if (st.peek().equals('('))
							st.pop();
						break;
					default:
						st.push(input.charAt(i));
						break;
					}
				} else {
					st.push(input.charAt(i));
				}
			}

			System.out.println(st.empty());
		}
		sc.close();
	}
}
