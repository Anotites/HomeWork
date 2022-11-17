package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAggregation {
    private CalculatorWithMathCopy calculatorWithMathCopy;
    long countOperation = 0;

    public CalculatorWithCounterAutoAggregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public double division(double numerator, double denominator) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.division(numerator, denominator);
    }

    public double multiplication(double factor1, double factor2) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.multiplication(factor1, factor2);
    }

    public double subtraction(double minuend, double subtrahend) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.subtraction(minuend, subtrahend);
    }

    public double addition(double addend1, double addend2) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.addition(addend1, addend2);
    }

    public double pow(double base, double power) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.pow(base, power);
    }

    public double absoluteValue(double value) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.absoluteValue(value);
    }

    public double squareRoot(double base) {
        countOperation = countOperation + 1;
        return calculatorWithMathCopy.squareRoot(base);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
