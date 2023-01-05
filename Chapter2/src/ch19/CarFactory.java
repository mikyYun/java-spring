package ch19;

public class CarFactory {

//	set private instance
	private CarFactory() {
		serialNum ++;
		setCarNum();
	}

	private static CarFactory instance = new CarFactory();
	private int serialNum = 10000;
	private int carNum;


	public int getCarNum() {
		return carNum;
	}
	
	private void setCarNum() {
		carNum = serialNum;
	}
	
	public static CarFactory getInstance () {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		car.createCar();
		return car;
	}
	
}
