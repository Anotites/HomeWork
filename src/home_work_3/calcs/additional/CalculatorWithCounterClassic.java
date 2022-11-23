package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation = 0;

    public void incrementCountOperation() {
        countOperation = countOperation + 1;
    }

    public long getCountOperation() {
        return countOperation;
    }
}
