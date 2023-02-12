package ch03;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    // default constructor
    /*
    public Customer() {
      ...
    }
    */
    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, string) call");

    }
    public int calcPrice(int price) {
            bonusPoint += price * bonusRatio;

        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo() {
        return "NAME: " + customerName + ", Grade: " + customerGrade;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
