package ch22;

public class TwoDTest {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 2, 3}, {1, 2, 3, 4}};
		
		int i, j;
		
		for (i = 0; i < arr.length; i ++) {
			
			for (j = 0; j < arr[i].length; j ++) {
				System.out.println("TEST" + arr[i][j]);
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@");
			System.out.println(arr[i]);
		}
	}
}
