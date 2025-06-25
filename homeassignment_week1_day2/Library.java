package week1.day2.homeassignment;

public class Library {
	
	public static String addBook(String bookTitle) {
		System.out.println(bookTitle+" Book added successfully");
		return bookTitle;
	}
	public static void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		lib.addBook("Selenium");
		lib.issueBook();

	}

}
