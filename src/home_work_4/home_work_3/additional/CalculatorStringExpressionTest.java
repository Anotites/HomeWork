package home_work_4.home_work_3.additional;

import home_work_3.calcs.additional.CalculatorStringExpression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static home_work_3.calcs.additional.CalculatorStringExpression.*;
import static home_work_3.calcs.additional.CalculatorStringExpression.OperatorType.END;
import static home_work_3.calcs.additional.CalculatorStringExpression.OperatorType.NUMBER;

public class CalculatorStringExpressionTest {

    String text = "4.1*2+(PI+1)^2";
    String textNew = "4.1";

    List<CalculatorStringExpression.Operator> operators = analysisOfOperators(text);
    CalculatorStringExpression.OperatorBuffer operatorBuffer = new CalculatorStringExpression.OperatorBuffer(operators);

    List<Operator> analysisOfOperators = new ArrayList<>();
    Operator first = new Operator(NUMBER, "4.1");
    Operator second = new Operator(END, "");

    @Test
    public void calculatorStringExpressionTestAnalysisOfOperators() {
        analysisOfOperators.add(first);
        analysisOfOperators.add(second);
        Assertions.assertEquals(analysisOfOperators.toString(), analysisOfOperators(textNew).toString());
    }

    @Test
    public void calculatorStringExpressionTestFactor() {
        Assertions.assertEquals(4.1, factor(operatorBuffer));
    }

    @Test
    public void calculatorStringExpressionTestMultDiv() {
        Assertions.assertEquals(8.2, multDiv(operatorBuffer));
    }

    double a = 8.2 + (Math.PI + 1) * (Math.PI + 1);

    @Test
    public void calculatorStringExpressionTestPlusMinus() {
        Assertions.assertEquals(a, plusMinus(operatorBuffer));
    }

    @Test
    public void calculatorStringExpressionTestExpr() {
        Assertions.assertEquals(a, expr(operatorBuffer));
    }

    String textMain = "4.1 + 15 * 7 + (28 / 5) ^ 2";

    List<CalculatorStringExpression.Operator> operatorsMain = analysisOfOperators(textMain);
    CalculatorStringExpression.OperatorBuffer operatorBufferMain = new CalculatorStringExpression.OperatorBuffer(operatorsMain);

    @Test
    public void calculatorStringExpressionTestMain() {
        Assertions.assertEquals(140.45999999999998, expr(operatorBufferMain));
    }
}
