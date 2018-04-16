package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numSize = scanner.nextInt();
		ArrayDeque<Integer> newArrayDeque = new ArrayDeque<Integer>();
		ArrayDeque<Integer> closeArrayDeque = new ArrayDeque<Integer>();
		int i;
		while (scanner.hasNext()) { // 读取键盘输入值
			for (i = 0; i < numSize; i++) {
				newArrayDeque.add(scanner.nextInt());
			}
			if (i >= numSize) {
				break;
			}
		}
		int temp;
		for (Integer integer : newArrayDeque) { // 将非关键数存入closeArrayDeque中
			temp = integer;
			while (temp != 1) {
				if (temp % 2 == 0) {
					temp = temp / 2;
					if (newArrayDeque.contains(temp)) {
						closeArrayDeque.add(temp);
					}
				} else {
					temp = (temp * 3 + 1) / 2;
					if (newArrayDeque.contains(temp)) {
						closeArrayDeque.add(temp);
					}
				}
			}
		}
		
		SortedSet<Integer> sortedSet = new TreeSet<Integer>(); // sortedSet用于存放关键数
		for (Integer integer : newArrayDeque) {
			if (!closeArrayDeque.contains(integer)) {
				sortedSet.add(integer);
			}
		}
		int[] leftInt = new int[sortedSet.size()];
		int j = sortedSet.size() - 1;
		for (Integer integer : sortedSet) {
			leftInt[j] = integer;
			j--;
		}
		for (int j2 = 0; j2 < leftInt.length; j2++) { // 按照从大到小的顺序输出关键数
			if (j2 == leftInt.length - 1) {
				System.out.println(leftInt[j2]);
			} else {
				System.out.print(leftInt[j2] + " ");
			}
		}
	}
}
