package home_work_4.home_work_3.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {

    ICalculator calculatorWithOperator = new CalculatorWithOperator();

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithOperator.addition(4.1,
                        calculatorWithOperator.addition(calculatorWithOperator.multiplication(15, 7),
                                calculatorWithOperator.pow(calculatorWithOperator.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithOperatorDivision() {
        Assertions.assertEquals(4, calculatorWithOperator.division(8, 2));
    }

    @Test
    public void calculatorWithOperatorMultiplication() {
        Assertions.assertEquals(16, calculatorWithOperator.multiplication(8, 2));
    }

    @Test
    public void calculatorWithOperatorSubtraction() {
        Assertions.assertEquals(6, calculatorWithOperator.subtraction(8, 2));
    }

    @Test
    public void calculatorWithOperatorAddition() {
        Assertions.assertEquals(10, calculatorWithOperator.addition(8, 2));
    }

    @Test
    public void calculatorWithOperatorPow() {
        Assertions.assertEquals(64, calculatorWithOperator.pow(8, 2));
    }

    @Test
    public void calculatorWithOperatorAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithOperator.absoluteValue(-8));
    }

    @Test
    public void calculatorWithOperatorAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithOperator.absoluteValue(8));
    }

    @Test
    public void calculatorWithOperatorSquareRoot() {
        Assertions.assertEquals(3, calculatorWithOperator.squareRoot(9));
    }
}
