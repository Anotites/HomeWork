package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    ICalculator iCalculator;
    double result;
    double finalResult;

    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public double division(double numerator, double denominator) {
        result = iCalculator.division(numerator, denominator);
        return iCalculator.division(numerator, denominator);
    }

    public double multiplication(double factor1, double factor2) {
        result = iCalculator.multiplication(factor1, factor2);
        return iCalculator.multiplication(factor1, factor2);
    }

    public double subtraction(double minuend, double subtrahend) {
        result = iCalculator.subtraction(minuend, subtrahend);
        return iCalculator.subtraction(minuend, subtrahend);
    }

    public double addition(double addend1, double addend2) {
        result = iCalculator.addition(addend1, addend2);
        return iCalculator.addition(addend1, addend2);
    }

    public double pow(double base, double power) {
        result = iCalculator.pow(base, power);
        return iCalculator.pow(base, power);
    }

    public double absoluteValue(double value) {
        result = iCalculator.absoluteValue(value);
        return iCalculator.absoluteValue(value);
    }

    public double squareRoot(double base) {
        result = iCalculator.squareRoot(base);
        return iCalculator.squareRoot(base);
    }

    public void save() {
        finalResult = result;
    }

    public double load() {
        save();
        result = 0;
        return finalResult;
    }
}
