package dataStructures.Java_08_Stack;

import java.util.*;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			Stack<Character> st = new Stack<Character>();
			char[] ch = new char[input.length()];
			ch = input.toCharArray();

			for (char ar : ch) {

				if (ar == '(' || ar == '{' || ar == '[') {
					st.push(ar);
				} else if (ar == ')') {
					if (st.peek() == '(') {
						try {
							st.pop();
						} catch (Exception e) {
							System.out.println("false");
							break;
						}
					} else {
						System.out.println("false");
						break;
					}

				} else if (ar == ']') {
					if (st.peek() == '[') {
						try {
							st.pop();
						} catch (Exception e) {
							System.out.println("false");
							break;
						}
					} else {
						System.out.println("false");
						break;
					}

				}

				else if (ar == '}') {
					if (st.peek() == '{') {
						try {
							st.pop();
						} catch (Exception e) {
							System.out.println("false");
							break;
						}
					} else {
						System.out.println("false");
						break;
					}

				}
				
			}
			if(st.empty()) {
				System.out.println("true");
			}
			
		}
		sc.close();
	}
}
