package home_work_4.home_work_3.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithMathCopy.addition(4.1,
                        calculatorWithMathCopy.addition(calculatorWithMathCopy.multiplication(15, 7),
                                calculatorWithMathCopy.pow(calculatorWithMathCopy.division(28,
                                        5), 2))));
    }

    @Test
    public void calculatorWithMathCopyDivision() {
        Assertions.assertEquals(4,
                calculatorWithMathCopy.division(8, 2));
    }

    @Test
    public void calculatorWithMathCopyMultiplication() {
        Assertions.assertEquals(16, calculatorWithMathCopy.multiplication(8, 2));
    }

    @Test
    public void calculatorWithMathCopySubtraction() {
        Assertions.assertEquals(6, calculatorWithMathCopy.subtraction(8, 2));
    }

    @Test
    public void calculatorWithMathCopyAddition() {
        Assertions.assertEquals(10,
                calculatorWithMathCopy.addition(8, 2));
    }

    @Test
    public void calculatorWithMathCopyPow() {
        Assertions.assertEquals(64,
                calculatorWithMathCopy.pow(8, 2));
    }

    @Test
    public void calculatorWithMathCopyAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithMathCopy.absoluteValue(-8));
    }

    @Test
    public void calculatorWithMathCopyAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithMathCopy.absoluteValue(8));
    }

    @Test
    public void calculatorWithMathCopySquareRoot() {
        Assertions.assertEquals(3,
                calculatorWithMathCopy.squareRoot(9));
    }
}
