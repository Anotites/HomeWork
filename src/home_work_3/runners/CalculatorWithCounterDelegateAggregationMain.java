package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAggregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy task3 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAggregation task8 = new CalculatorWithCounterAutoAggregation(task3);
        double value1 = task8.multiplication(15, 7);
        double value2 = task8.division(28, 5);
        double value3 = task8.pow(value2, 2);
        double value4 = task8.addition(value1, value3);
        double finalValue = task8.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(task8.getCountOperation());
    }
}
