
import java.util.Comparator;
import java.util.LinkedList;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> Books = new LinkedList<Book>();
		
		Books.add(new Book("Dune", 500, "Fiction"));
		Books.add(new Book("The Wretched of Muirwood (Legends of Muirwood Book 1)", 300, "Fantasy"));
		Books.add(new Book("The Blight of Muirwood (Legends of Muirwood Book 2)", 466, "Fantasy"));
		Books.add(new Book("Dune Messiah", 340, "Science Fiction"));
		Books.add(new Book("Children of Dune", 420, "Science Fiction"));
		
		/*
		 * Sorting based on title
		 * Creating a new comparator for using the title of the book for comparison
		 */
		Books.sort(new Comparator<Book>(){
			@Override
			public int compare(Book b1, Book b2) {
				return b1.title.compareTo(b2.title);
			}
		});
		
		for( Book b : Books) {
			System.out.println(b);
		}
	}

}
