package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		// array with 26 empty elements
		char[] alphs = new char[26];
		char ch = 'A';
		System.out.println(alphs.length);
		
		for (int i = 0; i < alphs.length; i ++) {
			alphs[i] = ch ++;
		
		}
		
		for (char alpha : alphs) {
			System.out.println(alpha + ", " + (int)alpha);
		}
	
	}

}
