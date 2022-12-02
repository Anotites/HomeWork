package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task43.divCheck;

public class Task43Test {

    @Test
    public void withoutATraceCheck() {
        Assertions.assertEquals("1 число без остатка делится на 2 число.", divCheck(32, 8));
    }

    @Test
    public void withATraceCheck() {
        Assertions.assertEquals("1 число без остатка не делится на 2 число. " +
                "Их частное равно 16.5. Остаток от деления равен 1.", divCheck(33, 2));
    }

    @Test
    public void zeroCheck() {
        Assertions.assertEquals("В данной задаче на ноль делить нельзя. " +
                "Запустите программу снова, выбрав другое значение.", divCheck(32, 0));
    }

}
