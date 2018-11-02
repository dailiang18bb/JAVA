package test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PlayGround_022 {
	public static void main(String[] args) {
		int lowest = 100;
		int lowestIndex = 0;
		int num = 0;
		
		boolean flag = false;

		ArrayList<String[]> arrayList = new ArrayList<>();
		String[] arr = {"dog","racecar","car"};
		String regString = "[^"+ arr[0] + "]";
		Pattern pattern = Pattern.compile(regString);
		
		for(String x : arr) {
			String[] temp = pattern.split(x);
			
			if(temp.length == 0) {
				arrayList.add(new String[]{x});
			} else {
				arrayList.add(temp);
			}
			
			if (!arrayList.get(num)[0].equals(x)) {
				flag = true;
			}
			num++;
		}
		
		
		for(int i =0; i< arrayList.size(); i++) {
			if(arrayList.get(i)[0].length() < lowest) {
				lowest = arrayList.get(i)[0].length();
				lowestIndex = i;
				
			}
		}
		System.out.println(arrayList.get(lowest)[0]);
		System.out.println(flag);
	}

}
