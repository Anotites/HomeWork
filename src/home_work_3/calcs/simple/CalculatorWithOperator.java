package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double division(double numerator, double denominator) {
        return numerator / denominator;
    }

    public double multiplication(double factor1, double factor2) {
        return factor1 * factor2;
    }

    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double addition(double addend1, double addend2) {
        return addend1 + addend2;
    }

    public double pow(double base, double power) {
        double result = base;
        for (long i = 1; i < power; i++) {
            result = result * base;
        }
        return result;
    }

    public double absoluteValue(double value) {
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    public double squareRoot(double base) {
        return Math.sqrt(base);
    }
}
