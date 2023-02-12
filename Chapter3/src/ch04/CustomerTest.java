package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1001, "Mike1");
//        customer1.setCustomerName("Mike1");
//        customer1.setCustomerID(1001);
        customer1.bonusPoint = 1000;

        VIPCustomer customer2 = new VIPCustomer(1002, "Mike2");
//        customer2.setCustomerName("Mike22");
//        customer2.setCustomerID(1002);
        customer2.bonusPoint = 10000;

        int price = customer2.calcPrice(10000);
        System.out.println(customer1.showCustomerInfo() + ". Price: " + price);


        price = customer1.calcPrice(10000);
        System.out.println(customer2.showCustomerInfo()+ ". Price: " + price);

        // vip customer but type customer
        Customer vc = new VIPCustomer(12312, "noname");

        System.out.println(vc.calcPrice(1000)); // calc from vip customer
    }
}
