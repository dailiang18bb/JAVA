import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    public static int maxHourGlass(int[][] n){
        int maxHour = -99999;
        int tempHour = 0;
        for(int i = 0; i < 4; i++){
            for(int j =0; j<4;j++){
                tempHour = n[i][j]+ n[i][j+1]+ n[i][j+2]
                            + n[i+1][j+1]
                            + n[i+2][j] + n[i+2][j+1] + n[i+2][j+2];
                if(tempHour > maxHour){
                    maxHour = tempHour;
                }
                tempHour = 0;
            }
        }
        return maxHour;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        System.out.println(maxHourGlass(arr));
    }
}

