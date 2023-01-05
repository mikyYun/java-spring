package ch21;

public class Book {

	private String title;
	private String author;
	
//	init
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
//	getter and setter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + ", " + author);
	}
}
