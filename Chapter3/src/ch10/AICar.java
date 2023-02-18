package ch10;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("AICar Starts driving");
        System.out.println("AICar controls direction");
    }

    @Override
    public void stop() {
        System.out.println("Auto stop in front of obstacles");
    }

    @Override
    public void wiper() {

    }

    @Override
    public void washCar() {
        System.out.println("Auto Wash");
    }
}
