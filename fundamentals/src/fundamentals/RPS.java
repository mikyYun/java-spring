package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		String[] strArr = {"Rock", "Paper", "Scissors"};
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 0; i < 10; i ++) {
//			System.out.println((int)(Math.random() * 3));
			String winner;
			
			int aiTmp = (int)(Math.random() * 3);
			System.out.println("Choose your RPS");
			System.out.println("1 for Rock, 2 for Paper, 3 for Scissors");
			
			int userTmp = scanner.nextInt();
			
			if (userTmp < 1 || userTmp > 3) {
				System.out.println("Inavlid attempt. Please try again");
				return;
			}
			
			Boolean isRock = userTmp == 1;
			Boolean isPaper = userTmp == 2;
			Boolean isScissors = userTmp == 3;

			if ((isRock && aiTmp == 2) ||
				(isPaper && aiTmp == 3) ||
				(isScissors && aiTmp == 1)
				) {
				winner = "AI";
			} else if ((isRock && aiTmp == 3) ||
				(isPaper && aiTmp == 1) ||
				(isScissors && aiTmp == 2)
				) {
				winner = "USER";
			} else {
				winner = "DRAW";
			}
			
			System.out.println("User : " + userTmp);
			System.out.println("AI : " + strArr[aiTmp]);
			System.out.println("Winnser is : " + winner);

			
			
			System.out.println(strArr[aiTmp]);
		}
		
	}

}
