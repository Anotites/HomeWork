package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAggregationMain {
    public static void main(String[] args) {
        CalculatorWithOperator task2 = new CalculatorWithOperator();
        CalculatorWithMathCopy task3 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends task4 = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiceAggregation task91 = new CalculatorWithCounterAutoChoiceAggregation(task2);
        CalculatorWithCounterAutoChoiceAggregation task92 = new CalculatorWithCounterAutoChoiceAggregation(task3);
        CalculatorWithCounterAutoChoiceAggregation task93 = new CalculatorWithCounterAutoChoiceAggregation(task4);

        double value1 = task91.multiplication2(15, 7);
        double value2 = task91.division2(28, 5);
        double value3 = task91.pow2(value2, 2);
        double value4 = task91.addition2(value1, value3);
        double finalValue = task91.addition2(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(task91.getCountOperation());

        double value11 = task92.multiplication(15, 7);
        double value21 = task92.division(28, 5);
        double value31 = task92.pow(value21, 2);
        double value41 = task92.addition(value11, value31);
        double finalValue1 = task92.addition(4.1, value41);
        System.out.printf("%.2f%n", finalValue1); // 140.46
        System.out.println(task92.getCountOperation());

        double value12 = task93.multiplication1(15, 7);
        double value22 = task93.division1(28, 5);
        double value32 = task93.pow1(value22, 2);
        double value42 = task93.addition1(value12, value32);
        double finalValue2 = task93.addition1(4.1, value42);
        System.out.printf("%.2f%n", finalValue2); // 140.46
        System.out.println(task93.getCountOperation());
    }
}
