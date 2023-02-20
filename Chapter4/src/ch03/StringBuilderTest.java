package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(android); // append string in the same memory => str1 + str2...
        System.out.println(System.identityHashCode(buffer));

        String test = buffer.toString();
        System.out.println(test);
    }
}
