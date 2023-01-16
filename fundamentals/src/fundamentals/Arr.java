package fundamentals;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {

		/*
//		int[] score;
//		score = new int[5]; // generate array with length 5 and type integer
		
		int[] score = new int[5];
		score[3] = 100;
		System.out.println(score[3]);
		
		int value = score[3];
		System.out.println(value);
	
//		for (int i = 0; i < 10; i ++) { // ERROR out of bound
			for (int i = 0; i < score.length; i ++) {
			
			System.out.println("arr[" + i + "] = " + score[i]);
		}
		*/
		
		int[] iArr = {100, 10, 5, 305, 33};
		for (int i = 0; i < iArr.length; i ++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
	}

}
