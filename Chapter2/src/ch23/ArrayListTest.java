package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

//		ArrayList<Book> library = new ArrayList<Book>();
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("TITLE", "AUTHOR"));
		library.add(new Book("TITLE1", "AUTHOR"));
		library.add(new Book("TITLE2", "AUTHOR"));
		library.add(new Book("TITLE3", "AUTHOR"));
		library.add(new Book("TITLE4", "AUTHOR"));
		library.add(new Book("TITLE5", "AUTHOR"));
		library.add(new Book("TITLE6", "AUTHOR"));
		
//		System.out.println(library);

		for (int i = 0; i < library.size(); i ++) {
			library.get(i).showInfo();
		}
	}

}
