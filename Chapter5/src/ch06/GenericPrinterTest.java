package ch06;


public class GenericPrinterTest {
    public static void main(String[] args) {
        // genericprinter in powder
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();

        powderPrinter.setMaterial(powder);

        Powder pwdr = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());

        // genericprinter in plastic
        Plastic plastic = new Plastic();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

        plasticPrinter.setMaterial(plastic);

        Plastic plstc = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter.toString());
    }
}
