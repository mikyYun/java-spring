package ch10;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("Human drives a car");
        System.out.println("Human controls direction");
    }

    @Override
    public void stop() {
        System.out.println("Push break pedal to stop in front of obstacle");
    }

    @Override
    public void wiper() {

    }
}
