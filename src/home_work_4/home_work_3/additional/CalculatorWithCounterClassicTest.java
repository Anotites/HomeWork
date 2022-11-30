package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterClassicTest {

    CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();

    @Test
    public void testMain1() {
        Assertions.assertEquals(140.45999999999998,
                calculatorWithCounterClassic.addition(4.1,
                        calculatorWithCounterClassic.addition(calculatorWithCounterClassic.multiplication(15, 7),
                                calculatorWithCounterClassic.pow(calculatorWithCounterClassic.division(28, 5),
                                        2))));
    }
}
