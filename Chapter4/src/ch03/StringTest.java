package ch03;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android); // concat strings create a new memory. Use StringBuilder Or StringBuffer

        System.out.println(System.identityHashCode(java));
    }
}
