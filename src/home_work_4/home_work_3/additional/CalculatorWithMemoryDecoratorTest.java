package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_3.calcs.additional.CalculatorWithMemoryDecorator.getCalculator;

public class CalculatorWithMemoryDecoratorTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithMemoryDecorator calculatorWithMemoryDecorator = new CalculatorWithMemoryDecorator(calculatorWithMathCopy);

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithMemoryDecorator.addition(4.1,
                        calculatorWithMemoryDecorator.addition(calculatorWithMemoryDecorator.multiplication(15, 7),
                                calculatorWithMemoryDecorator.pow(calculatorWithMemoryDecorator.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithMemoryDecoratorDivision() {
        Assertions.assertEquals(4, calculatorWithMemoryDecorator.division(8, 2));
    }

    @Test
    public void calculatorWithMemoryDecoratorMultiplication() {
        Assertions.assertEquals(16, calculatorWithMemoryDecorator.multiplication(8, 2));
    }

    @Test
    public void calculatorWithMemoryDecoratorSubtraction() {
        Assertions.assertEquals(6, calculatorWithMemoryDecorator.subtraction(8, 2));
    }

    @Test
    public void calculatorWithMemoryDecoratorAddition() {
        Assertions.assertEquals(10, calculatorWithMemoryDecorator.addition(8, 2));
    }

    @Test
    public void calculatorWithMemoryDecoratorPow() {
        Assertions.assertEquals(64, calculatorWithMemoryDecorator.pow(8, 2));
    }

    @Test
    public void calculatorWithMemoryDecoratorAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithMemoryDecorator.absoluteValue(-8));
    }

    @Test
    public void calculatorWithMemoryDecoratorAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithMemoryDecorator.absoluteValue(8));
    }

    @Test
    public void calculatorWithMemoryDecoratorSquareRoot() {
        Assertions.assertEquals(3, calculatorWithMemoryDecorator.squareRoot(9));
    }

    double b = calculatorWithMemoryDecorator.squareRoot(9);
    double c = calculatorWithMemoryDecorator.absoluteValue(b);

    @Test
    public void calculatorWithMemoryDecoratorLoad() {
        Assertions.assertEquals(3, calculatorWithMemoryDecorator.load());
    }

    ICalculator iCalculator = getCalculator();

    @Test
    public void calculatorWithMemoryDecoratorGetCalculator() {
        Assertions.assertEquals(true, iCalculator instanceof CalculatorWithMemoryDecorator);
    }

}

