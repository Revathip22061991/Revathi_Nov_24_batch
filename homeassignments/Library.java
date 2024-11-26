package week1.homeassignments;

public class Library {

	public String addBook(String bookTitle) {
			
			System.out.println("Book added successfully");
			return bookTitle;
		}

	public String issueBook() {
		System.out.println("Book issued successfully");
		return null;
	}
	
	public static void main(String[] args) {
		Library lib=new Library();
		lib.addBook(null);
		lib.issueBook();
	}
	}

