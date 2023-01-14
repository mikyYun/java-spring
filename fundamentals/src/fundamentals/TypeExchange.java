package fundamentals;

public class TypeExchange {

	public static void main(String[] args) {

		String str = "3";
//		System.out.println(str.charAt(0) - "0"); // ERROR		
		System.out.println(str.charAt(0) - '0'); // 3
		
		System.out.println('3' - '0' + 1); // 4
//		System.out.println('3' - '000' + 1); // Invalid character constant
		System.out.println(Integer.parseInt("3") + 1); // 4
		System.out.println("3" + 1); // 31
		System.out.println(3 + "0"); // 30
		
	}

}
