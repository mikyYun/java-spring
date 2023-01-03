package ch15;

public class Student {

	String studentName;
	int budget;
	
	public Student(String studentName, int budget) {
		this.studentName = studentName;
		this.budget = budget;		
	}
	
	public void payFee(int fee) {
		budget -= fee;
		showCurrentStatus();
	}
	
	public void showCurrentStatus() {
		System.out.println(studentName + "'s current budget is" + budget);
	}
}
