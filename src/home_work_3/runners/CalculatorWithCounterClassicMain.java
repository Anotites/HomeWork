package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic task5 = new CalculatorWithCounterClassic();
        double value1 = task5.multiplication(15, 7);
        task5.incrementCountOperation();
        double value2 = task5.division(28, 5);
        task5.incrementCountOperation();
        double value3 = task5.pow(value2, 2);
        task5.incrementCountOperation();
        double value4 = task5.addition(value1, value3);
        task5.incrementCountOperation();
        double finalValue = task5.addition(4.1, value4);
        task5.incrementCountOperation();
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(task5.getCountOperation());
    }
}
