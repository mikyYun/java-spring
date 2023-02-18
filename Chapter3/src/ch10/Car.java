package ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("Power On");
    }
    public void turnoff() {
        System.out.println("Power OFf");
    }

    public void washCar() {}
    final void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnoff();
        washCar();
    }
}
