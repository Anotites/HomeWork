package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithOperator task2 = new CalculatorWithOperator();

        CalculatorWithCounterAutoAggregationInterface task11 = new CalculatorWithCounterAutoAggregationInterface(task2);
        double value1 = task11.multiplication(15, 7);
        double value2 = task11.division(28, 5);
        double value3 = task11.pow(value2, 2);
        double value4 = task11.addition(value1, value3);
        double finalValue = task11.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(task11.getCountOperation());
    }
}
