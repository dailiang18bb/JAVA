package test;

import java.util.ArrayList;

public class PlayGround_014 {
	public static void main(String[] args) {
		PlayGround_014 test = new PlayGround_014();
		//test.feb();
		 System.out.println(Math.ceil((double) 11/3));
		 
	}

	public void feb() {
		ArrayList<Long> arrayList = new ArrayList<>(); 
		arrayList.add((long) 1);
		arrayList.add((long) 2);
		arrayList.add((long) 3);
		for (int i = 3; i < 100; i++) {
			long temp = arrayList.get(i-1) + arrayList.get(i-2);
			arrayList.add(temp);
		}
		
		for(long z : arrayList) {
			System.out.println(z);
		}
	}

}
