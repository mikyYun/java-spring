package ch03;

public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(7);
        stack.push(10);
        stack.push(11);
        stack.push(13);
        stack.push(151);
        stack.push(111);
        stack.push(23);
        stack.push(251);
        stack.push(211);
        stack.printAll();

        System.out.println("===========pop===========");
        stack.pop();
        stack.pop();
        stack.printAll();
        System.out.println("===========peek===========");
        stack.peek();
        stack.printAll();

    }
}
