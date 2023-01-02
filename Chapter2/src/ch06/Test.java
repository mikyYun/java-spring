package ch06;


public class Test {

	public static void main (String[] args) {
		
		Person person1 = new Person("Tomas", 180, 80, 55 );
		System.out.println(person1.showPersonInfo());
	
		Order order1 = new Order("E01", "Vancouver", 123123123, 500, 1);
		System.out.println(order1.showOrderInfo());

	}
	
	
}
