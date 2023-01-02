package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
//		will print by default constructor
		System.out.println(studentLee.showStudentInfo());
		
//		will print by overwritten constructor
		Student studentKim = new Student(123123, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}
	
}
