package fundamentals;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

//		System.out.println("TEST");
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		
//		System.out.println(num + " AND " + num2);
		
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		System.out.println(input + " AND " + input2);
		
	}

}
