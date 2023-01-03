package ch15;

public class Transit {

	String type;
	String companyName;
	int fee;
	int total;
	
	public Transit(String type, String companyName, int fee) {
		this.type = type;
		this.companyName = companyName;
		this.fee = fee;
	}
	
	private void getFee() {
		total += fee;
	}
	
	public void takePassenger(Student studentName) {
		studentName.payFee(this.fee);
		this.getFee();
		System.out.println(companyName + "'s " + type + " takes a passenger");
	}
	
}
