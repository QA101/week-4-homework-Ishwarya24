
public class Book{
	String title;
	int pages;
	String genre;
	String author;
	
	/*
	 * Constructor for the book
	 */
	public Book(String title, int pages, String genre, String author) {
		this.title = title;
		this.pages = pages;
		this.genre = genre;
		this.author = author;
	}
	
	public String toString() {
		return title;
	}
	
	public String Details() {
		return "Title: " + title + ", #pages: " + pages + ", Author: " + author;
	}
}
