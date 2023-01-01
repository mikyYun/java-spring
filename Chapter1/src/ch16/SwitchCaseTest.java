package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
//		int days;
//		
//		switch(month) {
//			
//			case 1: case 3: case 5: case 7: case 9: case 11:
//				days = 31;
//				break;
//			case 2:
//				days = 28;
//				break;
//			case 4: case 6: case 8: case 10: case 12:
//				days = 30;
//				break;
//			default:
//				System.out.println("The given month is not valid");
//				days = -1;
//				break;
//		}
		int days = switch(month) {
			
			case 1, 3, 5, 7, 9, 11 -> {
				yield 31;
			}
			case 2 -> {
				yield 28;
			}
			case 4, 6, 8, 10, 12 -> {
				yield 30;
			}
			default -> {
				System.out.println("The given month is not valid");
				yield -1;
			}
		};
		System.out.println("The given month(" + month + ") has " + days + " days");
		
	}

}
