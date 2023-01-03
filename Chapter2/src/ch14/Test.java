package ch14;

public class Test {

	public static void main(String[] args) {

		Student student1 = new Student("Mike", 10000);
		Student student2 = new Student("Miky", 5000);
		
		Transit bus = new Transit("Bus", 1);
		Transit expoLine = new Transit("Subway", 123);
		
		student1.takeBus(bus);
		student2.takeSubway(expoLine);
	}

}
