package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoCompositeTest {

    CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite = new CalculatorWithCounterAutoComposite();

    @Test
    public void testMain1() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoComposite.addition(4.1,
                        calculatorWithCounterAutoComposite.addition(calculatorWithCounterAutoComposite.multiplication(15, 7),
                                calculatorWithCounterAutoComposite.pow(calculatorWithCounterAutoComposite.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithCounterAutoCompositeDivision() {
        Assertions.assertEquals(4, calculatorWithCounterAutoComposite.division(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoCompositeMultiplication() {
        Assertions.assertEquals(16, calculatorWithCounterAutoComposite.multiplication(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoCompositeSubtraction() {
        Assertions.assertEquals(6, calculatorWithCounterAutoComposite.subtraction(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoCompositeAddition() {
        Assertions.assertEquals(10, calculatorWithCounterAutoComposite.addition(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoCompositePow() {
        Assertions.assertEquals(64, calculatorWithCounterAutoComposite.pow(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoCompositeAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithCounterAutoComposite.absoluteValue(-8));
    }

    @Test
    public void calculatorWithCounterAutoCompositeAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithCounterAutoComposite.absoluteValue(8));
    }

    @Test
    public void calculatorWithCounterAutoCompositeSquareRoot() {
        Assertions.assertEquals(3, calculatorWithCounterAutoComposite.squareRoot(9));
    }

    double b = calculatorWithCounterAutoComposite.squareRoot(9);
    double c = calculatorWithCounterAutoComposite.absoluteValue(9);

    @Test
    public void calculatorWithCounterAutoCompositeGetCountOperation() {
        Assertions.assertEquals(2, calculatorWithCounterAutoComposite.getCountOperation());
    }
}

