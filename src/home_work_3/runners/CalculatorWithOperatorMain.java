package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator task2 = new CalculatorWithOperator();
        double value1 = task2.multiplication(15, 7);
        double value2 = task2.division(28, 5);
        double value3 = task2.pow(value2, 2);
        double value4 = task2.addition(value1, value3);
        double finalValue = task2.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
    }
}
