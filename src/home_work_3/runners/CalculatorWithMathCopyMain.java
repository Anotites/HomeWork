package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy task3 = new CalculatorWithMathCopy();
        double value1 = task3.multiplication(15, 7);
        double value2 = task3.division(28, 5);
        double value3 = task3.pow(value2, 2);
        double value4 = task3.addition(value1, value3);
        double finalValue = task3.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
    }
}
