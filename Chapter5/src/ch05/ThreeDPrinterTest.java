package ch05;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        ThreeDPrinterThree printer = new ThreeDPrinterThree();
        printer.setMaterial(powder);

        // printer type is object. need to define type of getmaterial()
        Powder p = (Powder)printer.getMaterial();
    }
}
