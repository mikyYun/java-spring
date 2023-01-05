package ch19;

public class Car {

	private static int serialNum = 1000;
	private int carNum;
	
	public Car() {}

	public void createCar() {
		serialNum ++;
		setCarNum();
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	private void setCarNum() {
		carNum = serialNum;
	}
	
}
