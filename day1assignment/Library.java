package week2.day1assignment;

public class Library {
	
	public static void addBook(String bookTitle) {
		
		System.out.println(bookTitle);
		
		
	}
public static void  issueBook() {
		
		System.out.println( "Book issued successfully");
		
		
	}


	public static void main(String[] args) {
		
		Library obj = new Library();
	obj.issueBook();
	obj.addBook("Book added successfully");
	
	

	}

	
}
