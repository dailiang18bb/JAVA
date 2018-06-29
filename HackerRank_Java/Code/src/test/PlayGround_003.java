package test;

import java.math.BigInteger;
import java.util.Arrays;

public class PlayGround_003 {

	public static void main(String args[]) {
		
		int nums[]= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		String aString = Arrays.toString(nums);		
		String formattedString = aString.toString()
			    .replace(",", "")  //remove the commas
			    .replace("[", "")  //remove the right bracket
			    .replace("]", "")  //remove the left bracket
			    .replaceAll(" ", "")
			    .trim();           //remove trailing spaces from partially initialized arrays
		System.out.println(formattedString);
		
		
		BigInteger b = new BigInteger(formattedString);
		BigInteger c = new BigInteger("1");
		
		String temp = b.add(c).toString(10);
		
		
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		
		for (int x:newGuess) {
			System.out.println(x);
		}



	}
	
	
    public int[] plusOne(int[] digits) {
        String a = Arrays.toString(digits);
        String formatString = digits.toString()
            .replace(",", "")
            .replace(" ", "")
            .replace("[","")
            .replace("]","")
            .trim();
        int b = Integer.parseInt(formatString);
        String tempString = Integer.toString(b+1);
        int[] result = new int[tempString.length()];
        for(int x: result){
            result[x] = tempString.charAt(x) - '0';
        }
        return result;
    }
}
