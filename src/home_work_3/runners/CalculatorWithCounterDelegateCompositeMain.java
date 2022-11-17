package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite task7 = new CalculatorWithCounterAutoComposite();
        double value1 = task7.multiplication(15, 7);
        double value2 = task7.division(28, 5);
        double value3 = task7.pow(value2, 2);
        double value4 = task7.addition(value1, value3);
        double finalValue = task7.addition(4.1, value4);
        System.out.printf("%.2f%n", finalValue); // 140.46
        System.out.println(task7.getCountOperation());
    }
}
