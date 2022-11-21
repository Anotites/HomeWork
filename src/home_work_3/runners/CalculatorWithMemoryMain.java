package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator task2 = new CalculatorWithOperator();
        CalculatorWithMemory task12 = new CalculatorWithMemory(task2);
        task12.division(28, 5);
        task12.pow(task12.load(), 2);
        task12.addition(4.1, task12.load());
        task12.addition(task12.load(), task12.multiplication(15, 7));
        System.out.printf("%.2f%n", task12.load()); // 140.46
    }
}
