package test;

import java.util.*;
public class PlayGround_033 {
	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>(5);
		System.out.println(test.get(0));
//        test.set(0, 99);
//        test.set(0, 33);
        
        for(Integer x : test){
            System.out.println(x);
        }
	}

}
