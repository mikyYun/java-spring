package fundamentals;

public class Scores {

	public static void main(String[] args) {
		int[][] score = {
				{99, 100, 80},
				{80, 95, 95},
				{100, 100, 99},
				{57, 80, 76},
				{100, 80, 100}
		};
		
		int sub1Total = 0, sub2Total = 0, sub3Total = 0;
		
		for (int i = 0; i < score.length; i ++) {
			int sum = 0;
			float avg = 0.0f;
			
			sub1Total += score[i][0];
			sub2Total += score[i][1];
			sub3Total += score[i][2];

			
			for (int j = 0; j < score[i].length; j ++) {
				
				sum += score[i][j];
				System.out.printf("SCORE[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
	}

}
