package fundamentals;

public class MaxMin {

	public static void main(String[] args) {

		int[] score = {79, 50, 51, 100, 30};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i ++ ) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
	
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);
	}
	

}
