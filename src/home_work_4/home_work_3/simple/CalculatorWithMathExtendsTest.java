package home_work_4.home_work_3.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {

    ICalculator calculatorWithMathExtends = new CalculatorWithMathExtends();
    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithMathExtends.addition(4.1,
                        calculatorWithMathExtends.addition(calculatorWithMathExtends.multiplication(15, 7),
                                calculatorWithMathExtends.pow(calculatorWithMathExtends.division(28, 5),
                                        2))));
    }
    @Test
    public void calculatorWithMathExtendsPow() {
        Assertions.assertEquals(64, calculatorWithMathExtends.pow(8,2));
    }
    @Test
    public void calculatorWithMathExtendsAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithMathExtends.absoluteValue(-8));
    }
    @Test
    public void calculatorWithMathExtendsAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithMathExtends.absoluteValue(8));
    }
    @Test
    public void calculatorWithMathExtendsSquareRoot() {
        Assertions.assertEquals(3, calculatorWithMathExtends.squareRoot(9));
    }
}
