package fundamentals;

public class TwoDArr {

	public static void main(String[] args) {
		int[][] score = {
				{1, 2, 3},
				{10, 20, 30},
				{11, 21, 31},
				{100, 100, 100}
		};
		int sum = 0;
		
		for (int i = 0; i < 4; i ++) {
			for (int j = 0; j < score[i].length; j ++) {
				System.out.printf("SCORE[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("SUM : " +sum);
	}

}
