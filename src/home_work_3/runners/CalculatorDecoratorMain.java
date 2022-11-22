package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import static home_work_3.calcs.additional.CalculatorWithMemoryDecorator.getCalculator;


public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends task4 = new CalculatorWithMathExtends();
        CalculatorWithMemoryDecorator task13M = new CalculatorWithMemoryDecorator(task4);
        ICalculator task13 = new CalculatorWithCounterAutoDecorator(task13M);
        double value1 = task13.multiplication(15, 7);
        double value2 = task13.division(28, 5);
        double value3 = task13.pow(value2, 2);
        double value4 = task13.addition(value1, value3);
        double finalValue = task13.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(((CalculatorWithCounterAutoDecorator) task13).getCountOperation());
        ICalculator iCalculator = getCalculator();
        if (iCalculator instanceof CalculatorWithMemoryDecorator) {
            iCalculator.addition(finalValue, 0);
            System.out.printf("%.2f%n", ((CalculatorWithMemoryDecorator) iCalculator).load());
        }
    }
}
