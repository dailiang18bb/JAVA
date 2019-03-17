package warmup_challenges.sock_merchant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
//        Arrays.sort(ar);
//        int result = 0;
//        Stack<Integer> myStack = new Stack<>();
//        for(int i =0; i<n;i++){
//            if(myStack.empty() || myStack.peek() != ar[i]){
//                myStack.push(ar[i]);
//            }else if(myStack.peek() == ar[i]){
//                myStack.pop();
//                result++;
//            }
//        }
//        return result; 
        
        int result = 0;
        Set<Integer> myHashSet = new HashSet<>();
        for(Integer x : ar){
            if(!myHashSet.add(x)){
                myHashSet.remove(x);
                result++;
            }
        }
        return result;
    }
    //
    
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
