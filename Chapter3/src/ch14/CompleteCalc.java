package ch14;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return ERROR;
        }
        return num1 / num2;
    }
    public void showInfo() {
        System.out.println("Calculation Completed");
    }

    @Override
    public void description() {
        System.out.println("Overriden description inside CompleteCalc");
    }

    // cannot override private method
}
