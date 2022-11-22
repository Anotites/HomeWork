package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    static ICalculator iCalculator;
    long countOperation = 0;

    public static ICalculator getCalculator() {
        return new CalculatorWithCounterAutoDecorator(iCalculator);
    }

    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    @Override
    public double division(double numerator, double denominator) {
        countOperation = countOperation + 1;
        return iCalculator.division(numerator, denominator);
    }

    public double multiplication(double factor1, double factor2) {
        countOperation = countOperation + 1;
        return iCalculator.multiplication(factor1, factor2);
    }

    public double subtraction(double minuend, double subtrahend) {
        countOperation = countOperation + 1;
        return iCalculator.subtraction(minuend, subtrahend);
    }

    public double addition(double addend1, double addend2) {
        countOperation = countOperation + 1;
        return iCalculator.addition(addend1, addend2);
    }

    public double pow(double base, double power) {
        countOperation = countOperation + 1;
        return iCalculator.pow(base, power);
    }

    public double absoluteValue(double value) {
        countOperation = countOperation + 1;
        return iCalculator.absoluteValue(value);
    }

    public double squareRoot(double base) {
        countOperation = countOperation + 1;
        return iCalculator.squareRoot(base);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
