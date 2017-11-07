
public class Book{
	String title;
	int pages;
	String category;
	String summary;
	
	/*
	 * Constructor for the book
	 */
	public Book(String title, int pages, String category, String summary) {
		this.title = title;
		this.pages = pages;
		this.category = category;
		this.summary = summary;
	}
	
	public String toString() {
		return title;
	}
	
	public String Details() {
		return "Title: " + title + ", #pages: " + pages + ", Summary: " + summary;
	}
}
