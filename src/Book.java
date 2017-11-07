
public class Book{
	String title;
	int pages;
	String category;
	String summary;
	
	
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
	
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		return pages;
	}
	
	public String getcategory() {
		return category;
	}

}
