package test;

import java.util.*;

public class PlayGround_027 {
	public static void main(String[] args) {

        int a = 12;
        Integer b = 12;
        Integer c = Integer.valueOf(12);
        
        c = 18;
        
        Map<Character, Integer> ht = new Hashtable<>();
        
        ht.put('a', a);
        ht.put('b', b);
        ht.put('c', c);

        
        
        // System.out.println(null == null);
        
        System.out.println(ht.get('c') instanceof Integer);
        // System.out.println(a == b);
        // System.out.println( ht.get('a') == a );
        
        
        System.out.println( a == c);
        System.out.println( ht.get('b') == c);
        System.out.println( ht.get('a') != b);

	}

}
