package ch04;

public class StudentTest {

	public static void main (String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentId = 12345;
		studentLee.setStudnetName("Lee");
		studentLee.address = "Vancouver";
		
		studentLee.showStudentInfo();
		
		Student studentYun = new Student();
		studentYun.studentId = 123123;
		studentYun.studentName = "Yun";
		studentYun.address = "Canada";
		
		studentYun.showStudentInfo();
	
	}
	
}
