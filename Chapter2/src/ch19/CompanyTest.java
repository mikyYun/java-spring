package ch19;

public class CompanyTest {

	public static void main(String[] args) {

//		Company noCompany = Company(); cannot be resolved to a variable
//		System.out.println(noCompany);
		
		Company company = Company.getInstance();
		System.out.println(company);
		
		Company company2 = Company.getInstance(); 
		System.out.println(company2); // same as company. 	
		
	}

}
