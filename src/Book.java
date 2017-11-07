
public class Book{
	String title;
	int pages;
	String category;
	
	
	public Book(String title, int pages, String category) {
		this.title = title;
		this.pages = pages;
		this.category = category;
	}
	
	public String toString() {
		return title;
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
