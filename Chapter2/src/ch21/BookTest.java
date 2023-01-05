package ch21;

public class BookTest {

	public static void main(String[] args) {

		// array with 4 bytes each as null
		Book[] library = new Book[5];
		
//		for (int i = 0; i < library.length; i ++) {
//			System.out.println(library[i]); // => null
//		}
		
		library[0] = new Book("Name", "authorName");
		library[1] = new Book("Name", "authorName");
		library[2] = new Book("Name", "authorName");
		library[3] = new Book("Name", "authorName");
		library[4] = new Book("Name", "authorName");
		
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
