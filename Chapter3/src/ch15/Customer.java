package ch15;

public class Customer implements Buy, Sell{

    @Override
    public void order() {
        System.out.println("Customer order");
    }

    @Override
    public void buy() {
        System.out.println("Customer buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer sell");
    }

    public void hello() {
        System.out.println("Customer syas 'hello'");
    }
}
