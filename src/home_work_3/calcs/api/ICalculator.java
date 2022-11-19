package home_work_3.calcs.api;

public interface ICalculator {

    public double division(double numerator, double denominator);

    public double multiplication(double factor1, double factor2);

    public double subtraction(double minuend, double subtrahend);

    public double addition(double addend1, double addend2);

    public double pow(double base, double power);

    public double absoluteValue(double value);

    public double squareRoot(double base);
}
