package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoSuperTest {

    CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();

    @Test
    public void testMain1() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoSuper.addition(4.1,
                        calculatorWithCounterAutoSuper.addition(calculatorWithCounterAutoSuper.multiplication(15, 7),
                                calculatorWithCounterAutoSuper.pow(calculatorWithCounterAutoSuper.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithCounterAutoSuperDivision() {
        Assertions.assertEquals(4, calculatorWithCounterAutoSuper.division(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoSuperMultiplication() {
        Assertions.assertEquals(16, calculatorWithCounterAutoSuper.multiplication(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoSuperSubtraction() {
        Assertions.assertEquals(6, calculatorWithCounterAutoSuper.subtraction(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoSuperAddition() {
        Assertions.assertEquals(10, calculatorWithCounterAutoSuper.addition(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoSuperPow() {
        Assertions.assertEquals(64, calculatorWithCounterAutoSuper.pow(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoSuperAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithCounterAutoSuper.absoluteValue(-8));
    }

    @Test
    public void calculatorWithCounterAutoSuperAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithCounterAutoSuper.absoluteValue(8));
    }

    @Test
    public void calculatorWithCounterAutoSuperSquareRoot() {
        Assertions.assertEquals(3, calculatorWithCounterAutoSuper.squareRoot(9));
    }

    double b = calculatorWithCounterAutoSuper.squareRoot(9);
    double c = calculatorWithCounterAutoSuper.absoluteValue(9);

    @Test
    public void calculatorWithCounterAutoSuperGetCountOperation() {
        Assertions.assertEquals(2, calculatorWithCounterAutoSuper.getCountOperation());
    }
}

