package ch03;

public class VIPCustomer extends Customer {
     double salesRatio;
     private String agentID;

//    default constructor
    /*
     public VIPCustomer() {
         super(0, "no-name");
         bonusRatio = 0.05;
         salesRatio = 0.1;
         customerGrade = "VIP";
     }
    */
     public VIPCustomer(int customerID, String customerName) {

         super(customerID, customerName);
         bonusRatio = 0.05;
         salesRatio = 0.1;
         customerGrade = "VIP";
         System.out.println("VIPCustomer(int, string) call");
     }

     public String getAgentID() {
         return agentID;
     }
}
