package ch14;

public class Student {

	int money;
	String studentName;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Transit bus) {
		
		bus.take();
		this.money -= bus.fee;
		showInfo();
	}
	
	public void takeSubway(Transit subway) {
		subway.take();
		this.money -= subway.fee;
		showInfo();
	}
	
	public void showInfo() {
		System.out.println(studentName + " has " + money);
	}
	
}
