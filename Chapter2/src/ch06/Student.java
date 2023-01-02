package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
//	default constructor
	public Student() {}
	
//	overwriting constructor
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}
	
	public String showStudentInfo() {
		return studentName+ "'s student number is " + studentNumber + ", and grade is " + grade;
	}
	
}
