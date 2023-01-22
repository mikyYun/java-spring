package fundamentals;

import java.util.Arrays;

public class StringArr {

	public static void main(String[] args) {

		String[] strArr = {"Rock", "Paper", "Scissors"};
		System.out.println(Arrays.toString(strArr));
		
		for (int i = 0; i < 10; i ++) {
			int num = (int)(Math.random() * 3);
			System.out.println(num);
			System.out.println(strArr[num]);
		}
	}

}
