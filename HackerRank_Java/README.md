# HackerRank_JAVA
note what I learned from doing the JAVA exercise on HackerRank

# Primitive Data Types
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


# Static Variables and Variables
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html

# Static initialization blocks and initialization blocks
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

    //execute very first and only once
    Static initialization blocks: Static{}
    
    //execute after Static{} and execute every time you call the class
    initialization blocks       : {}        
    
# Static Variables and variables
动态变量在子程序中，每次调用都会从它的初始值开始调用，而不管他在函数中经历了什么变化；静态变量会从变化后的值继续改变。

# Exception 
	static boolean flag = true;
	static int B, H;
	static {
		Scanner in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();
		in.close();
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
			//System.exit(0);
		}
	}

# Integer to String
http://javadevnotes.com/java-integer-to-string-examples

	String s = "" + n;
	String s = Integer.toString(n);
	String s = String.valueOf(n);
	String s = new Integer(n).toString();
	String s = String.format("%d",n);
	String s = new StringBuffer().append(n).toString();
	String s = new StringBuilder().append(n).toString();

# Java Date and Time
https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html

	Calendar cal = Calendar.getInstance();
	cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
	int a = cal.get(Calendar.DAY_OF_WEEK);
	String[] weeks = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
	return weeks[a - 1];
	
# Java Currency Formatter
https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html
https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getCurrencyInstance-java.util.Locale-

	NumberFormat fmUS = NumberFormat.getCurrencyInstance(Locale.US);
	NumberFormat fmIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	NumberFormat fmChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
	NumberFormat fmFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	String us = fmUS.format(payment);
	String india = fmIndia.format(payment);
	String china = fmChina.format(payment);
	String france = fmFrance.format(payment);

# Java Strings Introduction
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	
	System.out.println(A.length() + B.length());
	System.out.println(A.compareTo(B)>0? "Yes" : "No");
	System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + 
                           B.substring(0, 1).toUpperCase()+ B.substring(1));
	
# Java SubString

	System.out.println(S.substring(start,end));

# Java Substring Comparisons

	public static String getSmallestAndLargestList(String s, int k) {
		Vector<String> substrings = new Vector<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			// Add a substring of length 'k' to our list
			substrings.add( s.substring(i, i + k) );
		}
		// Sort list
		Collections.sort(substrings);
		// Set first and last elements as smallest and largest
		String smallest = substrings.get(0);
		String largest = substrings.get(substrings.size() - 1);
		return smallest + "\n" + largest;
	}

# Java String Reverse

	// since Java 1.5 use StringBuilder
	System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
	// before Java 1.5 use StringBuffer
	System.out.println(A.equals(new StringBuffer(A).reverse().toString()) ? "Yes" : "No");
		
	
String cannot use `==` to compare, can only use `[StringName].equals([StringName])`

Explanation: Here we are creating two objects namely s1 and s2.

Both s1 and s2 refers to different objects.

When we use == operator for s1 and s2 comparison then the result is false as both have different addresses in memory.

Using equals, the result is true because its only comparing the values given in s1 and s2.


https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html

# Java Anagrams

	static boolean isAnagram(String a, String b) {
		// Complete the function
		char[] c = a.toLowerCase().toCharArray();
		char[] d = b.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		return Arrays.equals(c,d);
		// end of my code
	}

`replaceAll("[\\s]", "")` works for removing one single space.

	String replaceAll(String regex, String replacement)
	
Arrays class 
https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

Common use `Arrays.sort([ArrayName])`, `Arrays.equals([ArrayName],[ArrayName])`, `Arrays.toString([ArrayName])`
