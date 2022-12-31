package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
//		
//		boolean flag = (num1 > 0) && (num2 > 0);
//		System.out.println(flag);
//		
//		flag = (num1 < 0) || (num2 > 0);
//		System.out.println(flag);
//
//		flag = (num1 > 0) || (num2 > 0);
//		System.out.println(flag);
		
		int num1 = 10;
		int i = 2;
		
//		boolean val = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);

		boolean val = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		System.out.println(val);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
