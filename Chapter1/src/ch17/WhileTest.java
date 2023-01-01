package ch17;

public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while (num < 10) {
			sum += num;
			num ++;
			System.out.println("Increased");
		}
		System.out.println("Final Number is : " + num);
		System.out.println("Total Sum is : " + sum);
		
	}

}
