package fundamentals;

class ArrayTest {
	public static void main(String[] args) {
		int[] number = {1, 2, 3, 4, 6, 7, 54, 3};
		int[] counter = new int[10];
		
		for (int i = 0; i < number.length; i ++) {
			counter[number[i]] ++;
			System.out.println(number);
		}
	}
}