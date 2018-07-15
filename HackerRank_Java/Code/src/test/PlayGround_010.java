package test;

import java.util.jar.Attributes.Name;

public class PlayGround_010 {
	
	public static void main(String[] args) {
		
		eduBook mBook = new eduBook();
		mBook.name = "mBook";
		mBook.editor = " not working";
		mBook.catogrize = "ABS";
		mBook.tag = "edu";
		// mBook.editor = " not working";
		
        int[][] B = new int[3][2];

	}
}


class book {
	public String name;
	private String editor;
	protected String catogrize;
	String tag;
}

class eduBook extends book {

}
