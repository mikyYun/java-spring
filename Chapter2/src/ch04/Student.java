package ch04;

public class Student {
	
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println("student(" + studentName + ")'s id is " + studentId + " and address is " + address);
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudnetName(String name) {
		studentName = name;
	}
}
