public class Book{
	
	//Properties, Globals variables
	String title;
	int pageCount;
	int ISBN;
	// whether is or not check out
	boolean isCheckedOut;
	int dayCheckedOut;


	//Constructor
	public Book(String bookTitle, int bookPageCount, int bookISBN){
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckedOut = false;
		dayCheckedOut = -1;
	}


	// Getters
	public String getTitle(){
		return this.title;
	}

	public int getPageCount(){
		return this.pageCount;
	}

	public int getISBN(){
		return this.ISBN;
	}

	public boolean getIsCheckedOut(){
		return this.isCheckedOut;
	}

	public int getDayCheckedOut(){
		return this.dayCheckedOut;
	}


	//Setters

	public void setIsCheckedOut(boolean isCheckedOut, int currentDayCheckedOut){
		this.isCheckedOut = isCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);	
	}

	private void setDayCheckedOut(int day){
		this.dayCheckedOut = day;
	}



}