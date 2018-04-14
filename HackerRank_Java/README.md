# HackerRank_JAVA
note what I learned from doing the JAVA exercise on HackerRank


# My reminder
1. pay attention on the scope out the variables.



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


# Java Regular expression

https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum  
Useful website to test your regEx  
https://www.regexpal.com/  
https://regexr.com  
Learning regex websites  
https://deerchao.net/tutorials/regex/regex.htm  
http://www.infoq.com/cn/articles/regular-expressions-introduction-part01  


`[StringName].trim()`Returns a copy of the string, with leading and trailing whitespace omitted.

	String a = s.trim();
		if (a.isEmpty()) {
			System.out.println("0");
		} else {
			String[] b = a.split("[ !,?._'@]+");
			// String[] a = s.split("[^a-zA-Z]+");
			System.out.println(b.length);
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}

# Java Pattern Syntax Checker

Pattern class https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29  
`Pattern.compile([regex]);` Compiles the given regular expression into a pattern.  
`matches([String regex],[CharSequence input])` Compiles the given regular expression and attempts to match the given input against it.

	try {
		Pattern p = Pattern.compile(pattern);
		System.out.println("Valid");\
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid");
			}
# Java Regex IP address check

`IPv4 address check regex: `(([0-1]?\d?\d|2[0-4]\d|25[0-5])\.){3}(25[0-5]|[0-1]?\d\d?|2[0-4]\d|25[0-5])

	class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
			// IP.matches
		}
	}
	}

	// Write your code here

	class MyRegex {

	String pattern = "(([0-1]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}(25[0-5]|[0-1]?\\d\\d?|2[0-4]\\d|25[0-5])";

	}


class concept

# Java Regex delete duplicate words
http://tutorials.jenkov.com/java-regex/matcher.html


	public static void main(String[] args) {

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


The most important 

	String regex = "\\b(\\w+)(\\s+\\1){1,}\\b";
	Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	Matcher m = p.matcher(input);
	m.find()
	input = input.replaceAll(m.group(), m.group(1)); 
	
# Java Regex Valid Username Regular Expression

	class UsernameValidator {
	/*
	 * Write regular expression here.
	 */
	//Problem Setter's code: "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
	public static final String regularExpression = "\\b[a-zA-Z][a-zA-Z0-9_]{7,29}\\b";

	}

	public class Solution {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
	}

`[StringName].matches([regex])` This method returns true if, and only if, this string matches the given regular expression.  
https://www.tutorialspoint.com/java/java_string_matches.htm

# Java Regex Tag Content Extractor


	String regex = "<(.+)>([^<]+)<\\/\\1>";
	while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			Matcher m = p.matcher(line);
			if (m.find()) {
				do {
					System.out.println(m.group(2));
				} while (m.find());
			} else {
				System.out.println("None");
			}
			testCases--;
		}
		
`"<(.+)>([^<]+)<\\/\\1>"` regex for testing `<h1>Nayeem loves counseling</h1>`.  
review `do{} while();`  
Dowhile can run at least once no matter what condition is.

# Java BigInteger
https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html

	Scanner in = new Scanner(System.in);
	BigInteger a = in.nextBigInteger();
	BigInteger b = in.nextBigInteger();
	in.close();
	System.out.println(a.add(b));
	System.out.println(a.multiply(b));

BigInteger cannot use the [+-*/], use `.add`, `.mutiply`, `.subtract` and `.divide`

# Java BigDecimal
https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

	Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
			@Override
			public int compare(String a1, String a2) {
				// convert to big decimal inside comparator
				// so permanent string values are never changed
				// aka you only use the BigDecimal values to
				// compare the strings!
				BigDecimal a = new BigDecimal(a1);
				BigDecimal b = new BigDecimal(a2);
				return a.compareTo(b);
			}
		}));
		
Override the compare method inside the comparator.  
convert to big decimal inside comparator so permanent string values are never changed aka you only use the BigDecimal values to compare the strings!

# Java Primality Test
https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29

	System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

certainty - a measure of the uncertainty that the caller is willing to tolerate: if the call returns true the probability that this BigInteger is prime exceeds (1 - 1/2certainty). The execution time of this method is proportional to the value of this parameter.


# Java SubArray
https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#copyOf(int[],%20int)

	Arrays.copyOf(int[] original, int newLength)
	Arrays.copyOfRange(int[] original, int from, int to)
	
original - the array from which a range is to be copied  
newLength - the length of the copy to be returned  
from - the initial index of the range to be copied, inclusive  
to - the final index of the range to be copied, exclusive. (This index may lie outside the array.)

# Java 1D Array Part2
very hard should use DFS recursion
https://www.hackerrank.com/challenges/java-1d-array/problem

	public static boolean leapJump(int k, int leap, int[] game) {

		if (k < 0 || game[k] == 1) {
			return false;
		}
		if (k == game.length - 1 || k + leap > game.length - 1) {
			return true;
		}

		game[k] = 1;

		return leapJump(k + 1, leap, game) || leapJump(k - 1, leap, game) || leapJump(k + leap, leap, game);
	}

# Java List

	list.add(index, element); //index couldn't larger than list.size()
	list.add(e); //add to the end of the list
	list.remove(index); // index
	list.remove(o); //object

String conpare using `.equals()`  
e.g.`in.next().equals("Insert")`  

Enhanced for loop

	for (Integer p : list) {
			System.out.print(p + " ");
		}

Don't forget to close the Scanner `in.close();`

# Java Arraylist
2DArrayList input

	ArrayList<ArrayList> list2d = new ArrayList<ArrayList>();

		for (int j = 0; j < numList; j++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int elementsList = in.nextInt();
			for (int i = 0; i < elementsList; i++) {
				list.add(in.nextInt());
			}
			list2d.add(list);
		}
		

get value

	for (int i = 0; i < numQuestion; i++) {

			int line = in.nextInt();
			int row = in.nextInt();
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			tempList = list2d.get(line - 1);
			try {
				System.out.println(tempList.get(row - 1));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR!");
			}
		}

# Java List

	list.add(index, element); //index couldn't larger than list.size()
	list.add(e); //add to the end of the list
	list.remove(index); // index
	list.remove(o); //object

String conpare using `.equals()`  
e.g.`in.next().equals("Insert")`

print Array 

# Java Map
https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put(name, phone);
	if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}

`put(K, V)`  
`get(K)` return V  
`containsKey(K)` return boolean

# Java Stack
https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
`FILO`First in last out

	while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			Stack<Character> st = new Stack<Character>();

			for (int i = 0; i < input.length(); i++) {
				if (!st.empty()) {

					switch (input.charAt(i)) {
					case ']':
						if (st.peek().equals('['))
							st.pop();
						break;
					case '}':
						if (st.peek().equals('{'))
							st.pop();
						break;
					case ')':
						if (st.peek().equals('('))
							st.pop();
						break;
					default:
						st.push(input.charAt(i));
						break;
					}
				} else {
					st.push(input.charAt(i));
				}
			}

			System.out.println(st.empty());
		}
		
		
`push()`, `pop()`,`peek()`,`empty()`,`search()`
`switch` and `case` 


# Java HashSet
A set is an abstract data type that can store certain values, without any particular order, and no repeated values.  
Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.  
https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
##### The important points about Java HashSet class are:
1. HashSet stores the elements by using a mechanism called hashing.
2. HashSet contains unique elements only.  


		HashSet<String> hSet = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			hSet.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(hSet.size());
		}


# Java Generics
https://docs.oracle.com/javase/tutorial/java/generics/types.html  
https://www.youtube.com/watch?v=QB5pQT45zvg  
We can use Java Generic concept to print an array of objects, then invoke the generic method to print Integer arrays, Double arrays, String arrays etc.  
In the java generic method declaration, a type parameter section delimited by angle brackets (< and >) precedes the method's return type.  
The body of the generic method is declared like any other method and we use type parameters like T, E to represent reference types, primitive types like int, float are not used.


	class Printer {
	// Write your code here
	public static <T> void printArray(T[] mT) {
		for (T n : mT) {
			System.out.println(n);
		}
	}
	}

# Java Comparator
https://blog.csdn.net/renfufei/article/details/16359297
### Arrays.sort @Override compare method


	//sort(T[] a, Comparator<? super T> c)
	class Checker implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {

		if (p1.score == p2.score) {
			return p1.name.compareTo(p2.name);
		} else {
			return p2.score - p1.score;
		}
	}
	}

# Java Sort
### Override comparator for list
https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html


	studentList.sort(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getCgpa() == s2.getCgpa()) {
					if (s1.getFname() == s2.getFname()) {
						return s1.getId() - s2.getId();
					} else {
						return s1.getFname().compareTo(s2.getFname());
					}
				} else {
					return (s2.getCgpa() - s1.getCgpa()) < 0 ? -1 : (s2.getCgpa() == s1.getCgpa() ? 0 : 1);
				}
			}
		});

`Arrays.sort([ArrayName], [Override comparator])` deal with arrays  
`Collections.sort([ArrayListName], new [Override comparator]() )` deal with ArrayList  
`studentList.sort(new Comparator<Student>() { // @Override Public int compare ( args1, args2){ // your code}});`
