package ch09;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("Power on");
    }

    public void turnOFf() {
        System.out.println("Power off");
    }
}
