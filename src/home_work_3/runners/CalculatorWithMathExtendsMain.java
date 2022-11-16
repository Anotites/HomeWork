package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends task4 = new CalculatorWithMathExtends();
        double value1 = task4.multiplication(15, 7);
        double value2 = task4.division(28, 5);
        double value3 = task4.pow(value2, 2);
        double value4 = task4.addition(value1, value3);
        double finalValue = task4.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
    }
}
