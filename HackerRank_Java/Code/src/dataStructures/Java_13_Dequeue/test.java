package dataStructures.Java_13_Dequeue;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.add(num);
		}
		in.close();

		int max = 0;
		Set set = new HashSet<>();
		for (int i = 0; i < n - m + 1; i++) {
			for(int j=0;j<m;j++) {
				set.add(deque.);
				
			}
			
			
		}
		System.out.println(set.size());

	}
}
