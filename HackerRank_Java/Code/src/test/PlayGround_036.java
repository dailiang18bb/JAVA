package test;

import java.util.LinkedList;
import java.util.Queue;

public class PlayGround_036 {
	
	
	
	public static long waitingTime(int[] tickets, int p) {
		
		
		// Edge
		if(tickets == null || tickets.length==0) return 0;
		
		long res = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < tickets.length; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			res++;
			int ind = queue.poll();
			tickets[ind] -= 1;
			if(tickets[ind] != 0) {
				queue.add(ind);
			}else if(ind == p) {
				return res;
			}
		}
		return res;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] test = {2,6,3,4,5};
		int[] test2 = {5,5,2,3};
		int[] test3 = null;
		int[] test4 = {4,4,4,4,4,4};
		int p = 2;
		int p2 = 3;
		int p3 = 4;
		long result = waitingTime(test4, p3);
		
		System.out.println(result);
		
	}

}
