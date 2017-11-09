import java.util.ArrayList;

/*
 * Simple class to represent a library.
 * Library contains an arraylist of books
 */
public class Library {

	ArrayList<Book> catalog = new ArrayList<Book>();
	
	public static void main(String[] args) {
		Library lib = new Library();
		
		System.out.println(lib.toString());
	}
	
	/**
	 * Constructs a library with multiple books in the catalog
	 */
	public Library() {
		catalog.add(new Book("Dune", 500, "Fiction", "Frank Herbert"));
		
		catalog.add(new Book("The Wretched of Muirwood (Legends of Muirwood Book 1)", 300, "Fantasy", "Jeff Wheeler"));
		
		catalog.add(new Book("The Blight of Muirwood (Legends of Muirwood Book 2)", 466, "Fantasy", "Jeff Wheeler"));
		
		catalog.add(new Book("Dune Messiah", 340, "Science Fiction", ""));
		
		catalog.add(new Book("Children of Dune", 420, "Science Fiction",  ""));
	}
	
	/*
	 * Returns every book title from within the library's catalog.
	 */
	public String toString() {
		String returnString = "";
		for( Book b : catalog) {
			returnString += b + "\n";
		}
		return returnString;
	}

}
