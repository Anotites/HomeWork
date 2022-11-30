package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAggregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoChoiceAggregationTest {

    CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
    CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
    CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
    CalculatorWithCounterAutoChoiceAggregation calculatorWithCounterAutoChoiceAggregation1 = new CalculatorWithCounterAutoChoiceAggregation(calculatorWithMathCopy);
    CalculatorWithCounterAutoChoiceAggregation calculatorWithCounterAutoChoiceAggregation2 = new CalculatorWithCounterAutoChoiceAggregation(calculatorWithMathExtends);
    CalculatorWithCounterAutoChoiceAggregation calculatorWithCounterAutoChoiceAggregation3 = new CalculatorWithCounterAutoChoiceAggregation(calculatorWithOperator);

    @Test
    public void testMain1() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoChoiceAggregation1.addition(4.1,
                        calculatorWithCounterAutoChoiceAggregation1.addition(calculatorWithCounterAutoChoiceAggregation1.multiplication(15, 7),
                                calculatorWithCounterAutoChoiceAggregation1.pow(calculatorWithCounterAutoChoiceAggregation1.division(28, 5),
                                        2))));
    }

    @Test
    public void testMain2() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoChoiceAggregation2.addition1(4.1,
                        calculatorWithCounterAutoChoiceAggregation2.addition1(calculatorWithCounterAutoChoiceAggregation2.multiplication1(15, 7),
                                calculatorWithCounterAutoChoiceAggregation2.pow1(calculatorWithCounterAutoChoiceAggregation2.division1(28, 5),
                                        2))));
    }

    @Test
    public void testMain3() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterAutoChoiceAggregation3.addition2(4.1,
                        calculatorWithCounterAutoChoiceAggregation3.addition2(calculatorWithCounterAutoChoiceAggregation3.multiplication2(15, 7),
                                calculatorWithCounterAutoChoiceAggregation3.pow2(calculatorWithCounterAutoChoiceAggregation3.division2(28, 5),
                                        2))));
    }


    @Test
    public void calculatorWithCounterAutoAggregationDivision() {
        Assertions.assertEquals(4, calculatorWithCounterAutoChoiceAggregation1.division(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationMultiplication() {
        Assertions.assertEquals(16, calculatorWithCounterAutoChoiceAggregation1.multiplication(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSubtraction() {
        Assertions.assertEquals(6, calculatorWithCounterAutoChoiceAggregation1.subtraction(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAddition() {
        Assertions.assertEquals(10, calculatorWithCounterAutoChoiceAggregation1.addition(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationPow() {
        Assertions.assertEquals(64, calculatorWithCounterAutoChoiceAggregation1.pow(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue1() {
        Assertions.assertEquals(8, calculatorWithCounterAutoChoiceAggregation1.absoluteValue(-8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue2() {
        Assertions.assertEquals(8, calculatorWithCounterAutoChoiceAggregation1.absoluteValue(8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSquareRoot() {
        Assertions.assertEquals(3, calculatorWithCounterAutoChoiceAggregation1.squareRoot(9));
    }

    double b = calculatorWithCounterAutoChoiceAggregation1.squareRoot(9);
    double c = calculatorWithCounterAutoChoiceAggregation1.absoluteValue(9);

    @Test
    public void calculatorWithCounterAutoAggregationGetCountOperation() {
        Assertions.assertEquals(2, calculatorWithCounterAutoChoiceAggregation1.getCountOperation());
    }
    @Test
    public void calculatorWithCounterAutoAggregationDivision1() {
        Assertions.assertEquals(4, calculatorWithCounterAutoChoiceAggregation2.division1(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationMultiplication1() {
        Assertions.assertEquals(16, calculatorWithCounterAutoChoiceAggregation2.multiplication1(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSubtraction1() {
        Assertions.assertEquals(6, calculatorWithCounterAutoChoiceAggregation2.subtraction1(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAddition1() {
        Assertions.assertEquals(10, calculatorWithCounterAutoChoiceAggregation2.addition1(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationPow1() {
        Assertions.assertEquals(64, calculatorWithCounterAutoChoiceAggregation2.pow1(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue11() {
        Assertions.assertEquals(8, calculatorWithCounterAutoChoiceAggregation2.absoluteValue1(-8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue12() {
        Assertions.assertEquals(8, calculatorWithCounterAutoChoiceAggregation2.absoluteValue1(8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSquareRoot1() {
        Assertions.assertEquals(3, calculatorWithCounterAutoChoiceAggregation2.squareRoot1(9));
    }

    double b1 = calculatorWithCounterAutoChoiceAggregation2.squareRoot1(9);
    double c1 = calculatorWithCounterAutoChoiceAggregation2.absoluteValue1(9);

    @Test
    public void calculatorWithCounterAutoAggregationGetCountOperation1() {
        Assertions.assertEquals(2, calculatorWithCounterAutoChoiceAggregation2.getCountOperation());
    }
    @Test
    public void calculatorWithCounterAutoAggregationDivision2() {
        Assertions.assertEquals(4, calculatorWithCounterAutoChoiceAggregation3.division2(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationMultiplication2() {
        Assertions.assertEquals(16, calculatorWithCounterAutoChoiceAggregation3.multiplication2(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSubtraction2() {
        Assertions.assertEquals(6, calculatorWithCounterAutoChoiceAggregation3.subtraction2(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAddition2() {
        Assertions.assertEquals(10, calculatorWithCounterAutoChoiceAggregation3.addition2(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationPow2() {
        Assertions.assertEquals(64, calculatorWithCounterAutoChoiceAggregation3.pow2(8, 2));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue21() {
        Assertions.assertEquals(8, calculatorWithCounterAutoChoiceAggregation3.absoluteValue2(-8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationAbsoluteValue22() {
        Assertions.assertEquals(8, calculatorWithCounterAutoChoiceAggregation3.absoluteValue2(8));
    }

    @Test
    public void calculatorWithCounterAutoAggregationSquareRoot2() {
        Assertions.assertEquals(3, calculatorWithCounterAutoChoiceAggregation3.squareRoot2(9));
    }

    double b2 = calculatorWithCounterAutoChoiceAggregation3.squareRoot2(9);
    double c2 = calculatorWithCounterAutoChoiceAggregation3.absoluteValue2(9);

    @Test
    public void calculatorWithCounterAutoAggregationGetCountOperation2() {
        Assertions.assertEquals(2, calculatorWithCounterAutoChoiceAggregation3.getCountOperation());
    }
}

