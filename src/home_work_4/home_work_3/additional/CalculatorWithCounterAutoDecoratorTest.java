package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_3.calcs.additional.CalculatorWithMemoryDecorator.getCalculator;

public class CalculatorWithCounterAutoDecoratorTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithCounterAutoDecorator calculatorWithCounterAutoDecorator = new CalculatorWithCounterAutoDecorator(calculatorWithMathCopy);

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoDecorator.addition(4.1,
                        calculatorWithCounterAutoDecorator.addition(calculatorWithCounterAutoDecorator.multiplication(15, 7),
                                calculatorWithCounterAutoDecorator.pow(calculatorWithCounterAutoDecorator.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorDivision() {
        Assertions.assertEquals(4, calculatorWithCounterAutoDecorator.division(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorMultiplication() {
        Assertions.assertEquals(16, calculatorWithCounterAutoDecorator.multiplication(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorSubtraction() {
        Assertions.assertEquals(6, calculatorWithCounterAutoDecorator.subtraction(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorAddition() {
        Assertions.assertEquals(10, calculatorWithCounterAutoDecorator.addition(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorPow() {
        Assertions.assertEquals(64, calculatorWithCounterAutoDecorator.pow(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithCounterAutoDecorator.absoluteValue(-8));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithCounterAutoDecorator.absoluteValue(8));
    }

    @Test
    public void calculatorWithCounterAutoDecoratorSquareRoot() {
        Assertions.assertEquals(3, calculatorWithCounterAutoDecorator.squareRoot(9));
    }

    double b = calculatorWithCounterAutoDecorator.squareRoot(9);
    double c = calculatorWithCounterAutoDecorator.absoluteValue(9);

    @Test
    public void calculatorWithCounterAutoDecoratorGetCountOperation() {
        Assertions.assertEquals(2, calculatorWithCounterAutoDecorator.getCountOperation());
    }

    ICalculator iCalculator = getCalculator();

    @Test
    public void calculatorWithCounterAutoDecoratorGetCalculator() {
        Assertions.assertEquals(true, iCalculator instanceof CalculatorWithMemoryDecorator);
    }
}

