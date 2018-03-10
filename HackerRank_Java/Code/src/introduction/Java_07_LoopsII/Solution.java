package introduction.Java_07_LoopsII;
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] aa = new int[t];
		int[] bb = new int[t];
		int[] nn = new int[t];
		for (int i = 0; i < t; i++) {
			aa[i] = in.nextInt();
			bb[i] = in.nextInt();
			nn[i] = in.nextInt();
		}
		in.close();
		// Charles' code by 3/8/2018
		for (int j = 0; j < t; j++) {
			int sum = (int) aa[j];
			for (int g = 0; g < nn[j]; g++) {
				sum = (int) (sum + Math.pow(2, g) * bb[j]);
				System.out.printf("%d ", sum);
			}
			System.out.printf("\n");
		}
	}
}


/*

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            for(int j=0;j<n;j++){
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
        }
        in.close();
    }
}*/