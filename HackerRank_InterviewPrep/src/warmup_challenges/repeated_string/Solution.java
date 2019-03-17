package warmup_challenges.repeated_string;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if(s.length() == 1 && s.equals("a")){
            return n;
        } else {
            long result = 0;
            int ANum = 0;
            for(int i = 0; i<s.length();i++){
                if(s.charAt(i) == 'a'){
                    ANum++;
                }
            }
            result = ANum * (n/s.length());
            if(n%s.length() == 0){
                return result;
            }
            for(int j = 0; j < n%s.length();j++){
                if( s.charAt(j%s.length()) == 'a'){
                    result++;
                }
            }
            return result;
        }
    }
    
    //

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
