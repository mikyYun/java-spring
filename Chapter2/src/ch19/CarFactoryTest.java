package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getInstance();

		Car carOne = factory.createCar();
		Car carTwo = factory.createCar();
		
		System.out.println(carOne.getCarNum());
		System.out.println(carTwo.getCarNum());
	}

}
