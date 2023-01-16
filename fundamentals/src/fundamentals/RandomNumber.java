package fundamentals;

public class RandomNumber {

	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 1; i <= 20; i ++) {
//			System.out.println(Math.random() * 10); 
//			System.out.println((int)(Math.random() * 10) + 1); // 1 ~ 10
			System.out.println((int)(Math.random() * 11) - 5); // -5 ~ 5
		}
		
		
	}

}
