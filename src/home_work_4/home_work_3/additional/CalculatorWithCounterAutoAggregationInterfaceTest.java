package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAggregationInterfaceTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithCounterAutoAggregationInterface calculatorWithCounterAutoAggregation = new CalculatorWithCounterAutoAggregationInterface(calculatorWithMathCopy);

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoAggregation.addition(4.1,
                        calculatorWithCounterAutoAggregation.addition(calculatorWithCounterAutoAggregation.multiplication(15, 7),
                                calculatorWithCounterAutoAggregation.pow(calculatorWithCounterAutoAggregation.division(28, 5),
                                        2))));
    }

        @Test
    public void calculatorWithCounterAutoAggregationDivision() {
        Assertions.assertEquals(4, calculatorWithCounterAutoAggregation.division(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationMultiplication() {
        Assertions.assertEquals(16, calculatorWithCounterAutoAggregation.multiplication(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSubtraction() {
        Assertions.assertEquals(6, calculatorWithCounterAutoAggregation.subtraction(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAddition() {
        Assertions.assertEquals(10, calculatorWithCounterAutoAggregation.addition(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationPow() {
        Assertions.assertEquals(64, calculatorWithCounterAutoAggregation.pow(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithCounterAutoAggregation.absoluteValue(-8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithCounterAutoAggregation.absoluteValue(8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSquareRoot() {
        Assertions.assertEquals(3, calculatorWithCounterAutoAggregation.squareRoot(9));
    }

    double b = calculatorWithCounterAutoAggregation.squareRoot(9);
    double c = calculatorWithCounterAutoAggregation.absoluteValue(9);

    @Test
    public void calculatorWithCounterAutoAggregationGetCountOperation() {
        Assertions.assertEquals(2, calculatorWithCounterAutoAggregation.getCountOperation());
    }
}

