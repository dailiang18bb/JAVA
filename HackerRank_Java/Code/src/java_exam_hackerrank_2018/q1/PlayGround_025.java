package java_exam_hackerrank_2018.q1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlayGround_025 {

	// Complete the braces function below.
	static String[] braces(String[] values) {
		String[] result = new String[values.length];

		for (int i = 0; i < values.length; i++) {
			if (values[i].length() % 2 != 0) {
				result[i] = "NO";
			}
		}

		for (int i = 0; i < values.length; i++) {
			char[] ch = values[i].toCharArray();
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < ch.length; j++) {
				if (stack.empty()) {
					stack.push(ch[j]);
				} else if (ch[j] == '}' && stack.peek().equals('{')) {
					stack.pop();
				} else if (ch[j] == ']' && stack.peek().equals('[')) {
					stack.pop();
				} else if (ch[j] == ')' && stack.peek().equals('(')) {
					stack.pop();
				} else {
					stack.push(ch[j]);
				}
			}
			if (stack.empty()) {
				result[i] = "YES";
			} else {
				result[i] = "NO";
			}
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int valuesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] values = new String[valuesCount];

		for (int i = 0; i < valuesCount; i++) {
			String valuesItem = scanner.nextLine();
			values[i] = valuesItem;
		}

		String[] res = braces(values);

//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(res[i]);
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
