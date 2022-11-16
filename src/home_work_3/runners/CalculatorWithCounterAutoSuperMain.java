package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper task6 = new CalculatorWithCounterAutoSuper();
        double value1 = task6.multiplication(15, 7);
        double value2 = task6.division(28, 5);
        double value3 = task6.pow(value2, 2);
        double value4 = task6.addition(value1, value3);
        double finalValue = task6.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(task6.getCountOperation());
    }
}
