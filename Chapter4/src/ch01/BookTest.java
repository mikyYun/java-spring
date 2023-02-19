package ch01;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Demian", "H.H");
        System.out.println(book); // memory address without toString
        System.out.println(book.toString()); // override toString


        String str = new String("Test");
        System.out.println(str);
    }

}
