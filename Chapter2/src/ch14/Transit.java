package ch14;

public class Transit {
	String transitType;
	int fee;
	int transitNumber;
	int passengerCount;
	int income = 0;
	
	
	public Transit(String transitType, int transitNumber) {
		this.transitType = transitType;
		this.transitNumber = transitNumber;
		if (transitType == "Bus") {
			this.fee = 1000;
		} else if (transitType == "Subway") {
			this.fee = 1200;
		}
		
	}
	
	public void take() {
		this.income += this.fee;
		this.passengerCount += 1;
		System.out.println(transitType + " earned " + fee + ".\nCurrent passengers are " + passengerCount);
	}
	
}
