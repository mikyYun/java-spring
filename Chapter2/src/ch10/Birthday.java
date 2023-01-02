package ch10;

public class Birthday {

	// set private to prevent updated by external factors
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		
		if (isValid) {
			System.out.println( year + "y " + month + "m " + day + ".");
		} else {
			System.out.println("Invalid date");
		}
	}
}
