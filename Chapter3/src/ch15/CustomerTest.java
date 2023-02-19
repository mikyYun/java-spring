package ch15;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.order();
        customer.buy();
        customer.sell();
        customer.hello();

        System.out.println("=============BUYER=============");
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        System.out.println("=============SELLER=============");
        Sell seller = customer;
        seller.order();
        seller.sell();

    }
}
