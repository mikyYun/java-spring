package ch19;

//	Singleton pattern example
public class Company {
	
	private static Company instance = new Company();

	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
	
}
