package ch06;

public class GoldCustomer extends Customer {
    double salesRatio;
    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}
