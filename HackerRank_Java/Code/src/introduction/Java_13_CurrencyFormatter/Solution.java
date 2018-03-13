package introduction.Java_13_CurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.

		NumberFormat fmUS = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat fmIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat fmChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat fmFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		String us = fmUS.format(payment);
		String india = fmIndia.format(payment);
		String china = fmChina.format(payment);
		String france = fmFrance.format(payment);
		
		//end of my code

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);

	}
}
