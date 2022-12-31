package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

//		int age = 7;
//		
//		if (age >= 8) {
//			System.out.println("Go to school");
//		} else {
//			System.out.println("Play fun");
//		}

		
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();

		if (age >= 8 && age < 13) {
			System.out.println("Elementary School");
		} else if (age >= 13 && age < 16) {
			System.out.println("Middle School");
		} else if (age >= 16 && age < 19) {
			System.out.println("High School");
		} else if (age >= 19) {
			System.out.println("Congratulation. Finished mendatory educations");
		} else {
			System.out.println("It's time to play with friends");
		}
		
	}

}
