package ch15;

public class Test {

	public static void main(String[] args) {

		Student mike = new Student("mike", 150);
		Transit luxuryTaxi = new Transit("taxi", "ExpensiveTX", 100);
		
		luxuryTaxi.takePassenger(mike);
		
		
	}

}
