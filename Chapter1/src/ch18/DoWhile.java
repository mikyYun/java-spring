package ch18;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int sum = 0;
		
		do {
			sum += input;
			input = scanner.nextInt();
		} while (input != 0);
		
		System.out.println(sum);

	}

}
