package ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer c1 = new Customer(1001, "Tom");
        Customer c2 = new Customer(1001, "Jin");
        Customer c3 = new GoldCustomer(1001, "Mark");
        Customer c4 = new VIPCustomer(1001, "Mike");
        Customer c5 = new GoldCustomer(1001, "Luke");

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
//--------------------test 1 completed

        int price = 10000;
        for (Customer customer: customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " paied " + cost);
            System.out.println(customer.getCustomerName() + "'s current point is : " + customer.bonusPoint);
        }
    }
}
