package strings.Java_09_JavaRegex2DuplicateWords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

    	    //Problem Setter's code: "(\\b\\w+\\b)(\\s+\\1\\b)+";
        String regex = "\\b(\\w+)(\\s+\\1){1,}\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
            	// m.group() the entire match
            	// m.group(1) the first group match
                input = input.replaceAll(m.group(), m.group(1));    
            }     
            // Prints the modified sentence.
            System.out.println(input);
        }        
        in.close();        
    }
}

