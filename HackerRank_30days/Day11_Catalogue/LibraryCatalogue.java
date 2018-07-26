

import java.util.Map;
import java.util.HashMap;


public class LibraryCatalogue{

	// Properties
	Map<String,Book> bookCollection = new HashMap<>();
	int currentDay = 0;
	int lengthOfCheckOutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;


	//Constructor
	public LibraryCatalogue(Map<String, Book> collection){
		this.bookCollection = collection;
	}

	public LibraryCatalogue(Map<String,Book> collection,
							int lengthOfCheckOutPeriod,
							double initialLateFee,
							double feePerLateDay){
		this.bookCollection = collection;
		this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}


	//Getters
	public int getCurrentDay(){
		return currentDay;
	}

	public Map<String,Book> getBookCollection(){
		return bookCollection;
	}

	public Book getBook(String bookTitle){
		return getBookCollection().get(bookTitle);
	}

	public int getLengthOfCheckOutPeriod(){
		return lengthOfCheckOutPeriod;
	}

	public double getInitialLateFee(){
		return initialLateFee;
	}

	public double getFeePerLateDay(){
		return feePerLateDay;
	}

	//Setters
	public void nextDay(){
		currentDay ++; 
	}

	public void setDay(int day){
		this.currentDay = day;
	}


	//Instance Method
	public void checkout(String title){
		Book book = getBook(title);
		if(book.getIsCheckedOut()){
			sorryBookAlreadyCheckedOut(getBook(title));
		} else{
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checkout "+ title + ". It's due on day"
				+ (getCurrentDay() + getLengthOfCheckOutPeriod()) +".");
		}
	}

	public void returnBook(String title){
		Book book = getBook(title);
		int dateLate = currentDay - (book.getDayCheckedOut()+getLengthOfCheckOutPeriod());
		if(dateLate > 0){
			System.out.println("You own the Library $" + (getInitialLateFee() + dateLate*getFeePerLateDay())
				+ "because your book is " + dateLate + "over due.");
		}else{
			System.out.println("Book returned, thank you!");
		}
		book.setIsCheckedOut(false, -1);
	}

	public void sorryBookAlreadyCheckedOut(Book book){
		System.out.println("Sorry, the book"+book.getTitle()+ "is already checked out."
			+ "It should be back on day "+ (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");
	}


	public static void main(String[] args) {
		Map<String,Book> bookCollection = new HashMap<>();
		Book harry = new Book("Harry Potter", 17823, 9999999);
		bookCollection.put("Harry Potter", harry);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		lib.checkout("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.checkout("Harry Potter");
		lib.setDay(17);
		lib.returnBook("Harry Potter");
		lib.checkout("Harry Potter");
	}
}