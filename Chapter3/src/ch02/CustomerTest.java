package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("Mike1");
        customer1.setCustomerID(1001);
        customer1.bonusPoint = 1000;
        System.out.println(customer1.showCustomerInfo());

        VIPCustomer customer2 = new VIPCustomer();
        customer2.setCustomerName("Mike22");
        customer2.setCustomerID(1002);
        customer2.bonusPoint = 10000;
        System.out.println(customer2.showCustomerInfo());

    }
}
