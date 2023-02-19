package ch14;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        myMethod();
        System.out.println("Provide four arithmetic operations");
    }

    static int total(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        myStaticMetnod();
        return total;
    }

    private void myMethod() {
        System.out.println("private_ myMethod");
    }

    private static void myStaticMetnod() {
        System.out.println("private_ myStaticMethod");
    }

}
