package ch02;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.addElement("D");
        list.addElement("E");
        list.addElement("F");
        list.addElement("G");
        list.printAll();

        System.out.println("---------Insertion test---------");
        list.insertElement(3, "I");
        list.printAll();

        System.out.println("---------Remove One test---------");
        list.removeElement(2);
        list.printAll();

        System.out.println("---------Remove All test---------");
        list.removeAll();
        list.printAll();
    }
}
