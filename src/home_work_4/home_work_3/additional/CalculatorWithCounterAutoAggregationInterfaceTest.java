package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAggregationInterfaceTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithCounterAutoAggregationInterface calculatorWithCounterAutoAggregationInterface = new CalculatorWithCounterAutoAggregationInterface(calculatorWithMathCopy);

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoAggregationInterface.addition(4.1,
                        calculatorWithCounterAutoAggregationInterface.addition(calculatorWithCounterAutoAggregationInterface.multiplication(15, 7),
                                calculatorWithCounterAutoAggregationInterface.pow(calculatorWithCounterAutoAggregationInterface.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceDivision() {
        Assertions.assertEquals(4, calculatorWithCounterAutoAggregationInterface.division(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceMultiplication() {
        Assertions.assertEquals(16, calculatorWithCounterAutoAggregationInterface.multiplication(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceSubtraction() {
        Assertions.assertEquals(6, calculatorWithCounterAutoAggregationInterface.subtraction(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceAddition() {
        Assertions.assertEquals(10, calculatorWithCounterAutoAggregationInterface.addition(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfacePow() {
        Assertions.assertEquals(64, calculatorWithCounterAutoAggregationInterface.pow(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithCounterAutoAggregationInterface.absoluteValue(-8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithCounterAutoAggregationInterface.absoluteValue(8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceSquareRoot() {
        Assertions.assertEquals(3, calculatorWithCounterAutoAggregationInterface.squareRoot(9));
    }

    double b = calculatorWithCounterAutoAggregationInterface.squareRoot(9);
    double c = calculatorWithCounterAutoAggregationInterface.absoluteValue(9);

    @Test
    public void calculatorWithCounterAutoAggregationInterfaceGetCountOperation() {
        Assertions.assertEquals(2, calculatorWithCounterAutoAggregationInterface.getCountOperation());
    }
}

