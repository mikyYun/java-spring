package ch24;


public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("Writing", 100);
		studentLee.addSubject("Math", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("Writing", 70);
		studentKim.addSubject("Math", 85);
		studentKim.addSubject("English", 100);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
		
	}

}
