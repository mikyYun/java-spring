package ch06;

public class Person {
	
	String personName;
	int personHeight;
	int personWeight;
	int personAge;

	public Person () {}

	public Person (String personName, int personHeight, int personWeight, int personAge) {
			this.personName = personName;
			this.personHeight = personHeight;
			this.personWeight = personWeight;
			this.personAge = personAge;
	}
	
	public String showPersonInfo() {
		
		return "This person is.. \nHeight: " + personHeight + "\nWeight: " + personWeight + "\nName: " + personName + "\nAge: " + personAge;
	}
}
