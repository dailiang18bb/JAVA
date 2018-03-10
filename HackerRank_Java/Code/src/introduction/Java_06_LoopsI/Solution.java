package introduction.Java_06_LoopsI;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=10;i++){
            //System.out.println(n + " x " + i + " = " + n*i);
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }
        in.close();
    }
}