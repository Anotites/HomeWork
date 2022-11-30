package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMemoryTest {

    ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(calculatorWithMathCopy);

    @Test
    public void testMain() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithMemory.addition(4.1,
                        calculatorWithMemory.addition(calculatorWithMemory.multiplication(15, 7),
                                calculatorWithMemory.pow(calculatorWithMemory.division(28, 5),
                                        2))));
    }

    @Test
    public void calculatorWithMemoryDivision() {
        Assertions.assertEquals(4, calculatorWithMemory.division(8, 2));
    }

    @Test
    public void calculatorWithMemoryMultiplication() {
        Assertions.assertEquals(16, calculatorWithMemory.multiplication(8, 2));
    }

    @Test
    public void calculatorWithMemorySubtraction() {
        Assertions.assertEquals(6, calculatorWithMemory.subtraction(8, 2));
    }

    @Test
    public void calculatorWithMemoryAddition() {
        Assertions.assertEquals(10, calculatorWithMemory.addition(8, 2));
    }

    @Test
    public void calculatorWithMemoryDecoratorPow() {
        Assertions.assertEquals(64, calculatorWithMemory.pow(8, 2));
    }

    @Test
    public void calculatorWithMemoryAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithMemory.absoluteValue(-8));
    }

    @Test
    public void calculatorWithMemoryAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithMemory.absoluteValue(8));
    }

    @Test
    public void calculatorWithMemorySquareRoot() {
        Assertions.assertEquals(3, calculatorWithMemory.squareRoot(9));
    }

    double b = calculatorWithMemory.squareRoot(9);
    double c = calculatorWithMemory.absoluteValue(b);

    @Test
    public void calculatorWithMemoryLoad() {
        Assertions.assertEquals(3, calculatorWithMemory.load());
    }

}

