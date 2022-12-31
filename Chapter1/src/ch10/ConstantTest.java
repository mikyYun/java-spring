package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM + " And " + MIN_NUM);
		System.out.println(MIN_NUM);

//		MIN_NUM = 1; => cannot reassign to constant variable
//		System.out.println(MIN_NUM);

	
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; // 1 + 0
		int iNum2 = (int)(dNum + fNum); // int(2.1)
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
	}

}
