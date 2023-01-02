package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreanSubject("Korean", 100);
		studentLee.setMathSubject("Math", 100);
		
		Student studentKim = new Student(100, "Lee");
		studentKim.setKoreanSubject("Korean", 90);
		studentKim.setMathSubject("Math", 99);
	
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
		
	}
	
}
