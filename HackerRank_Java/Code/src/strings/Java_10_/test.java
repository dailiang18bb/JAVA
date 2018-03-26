package strings.Java_10_;

import java.util.regex.Pattern;

public class test {
	
	public void main (String[] arg) {
		
		String input = "ABCD abcd";
		String regex = "";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		System.out.println(p.matches(regex, input));
		
	}

}
