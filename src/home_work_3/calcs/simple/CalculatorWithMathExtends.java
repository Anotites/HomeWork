package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double pow(double base, double power) {
        return Math.pow(base, power);
    }

    @Override
    public double absoluteValue(double value) {
        return Math.abs(value);
    }

    @Override
    public double squareRoot(double base) {
        return Math.sqrt(base);
    }
}
