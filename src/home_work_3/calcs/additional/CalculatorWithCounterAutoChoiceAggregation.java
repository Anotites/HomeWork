package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAggregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    private long countOperation = 0;

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoChoiceAggregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
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

    public double division2(double numerator, double denominator) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.division(numerator, denominator);
    }

    public double multiplication2(double factor1, double factor2) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.multiplication(factor1, factor2);
    }

    public double subtraction2(double minuend, double subtrahend) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.subtraction(minuend, subtrahend);
    }

    public double addition2(double addend1, double addend2) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.addition(addend1, addend2);
    }

    public double pow2(double base, double power) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.pow(base, power);
    }

    public double absoluteValue2(double value) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.absoluteValue(value);
    }

    public double squareRoot2(double base) {
        countOperation = countOperation + 1;
        return calculatorWithOperator.squareRoot(base);
    }

    public double division1(double numerator, double denominator) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.division(numerator, denominator);
    }

    public double multiplication1(double factor1, double factor2) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.multiplication(factor1, factor2);
    }

    public double subtraction1(double minuend, double subtrahend) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.subtraction(minuend, subtrahend);
    }

    public double addition1(double addend1, double addend2) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.addition(addend1, addend2);
    }

    public double pow1(double base, double power) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.pow(base, power);
    }

    public double absoluteValue1(double value) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.absoluteValue(value);
    }

    public double squareRoot1(double base) {
        countOperation = countOperation + 1;
        return calculatorWithMathExtends.squareRoot(base);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
