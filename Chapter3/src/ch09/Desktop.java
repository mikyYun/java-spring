package ch09;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Display screen");
    }

    @Override
    public void typing() {
        System.out.println("Typing");
    }
}
