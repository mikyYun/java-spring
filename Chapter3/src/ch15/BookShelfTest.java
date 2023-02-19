package ch15;

public class BookShelfTest {
    public static void main (String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("Runner 1");
        bookQueue.enQueue("Runner 2");
        bookQueue.enQueue("Runner 3");
        bookQueue.enQueue("Runner 4");
        bookQueue.enQueue("Runner 5");

        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());

    }
}
