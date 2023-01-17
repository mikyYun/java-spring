package fundamentals;

public class ArrEx1 {

	public static void main(String[] args) {

		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 99};
		
		for (int i = 0; i < score.length; i ++) {
			sum += score[i];
		}
		
//		average = sum / score.length; // 97.0
//		average = sum / (float)score.length; // 97.4
		average = (float)sum / score.length; // 97.4

		System.out.println("Total : " + sum);
		System.out.println("AVG : " + average);
		
	}

}
