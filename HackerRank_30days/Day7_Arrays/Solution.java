import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // my method
    public static void printReverse(int[] arr) {
        int[] arrReverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[arr.length - 1 - i] = arr[i];
        }
        for (int x : arrReverse) {
            System.out.print(x + " ");
        }
    }
    // end

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();
        printReverse(arr);
    }

}
