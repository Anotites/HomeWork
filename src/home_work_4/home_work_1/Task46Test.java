package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task46.yearCheck;

public class Task46Test {

    @Test
    public void leapYearCheck() {
        Assertions.assertEquals("2020 - это високосный год.", yearCheck(2020));
    }

    @Test
    public void nonLeapYearCheck() {
        Assertions.assertEquals("2014 - это не високосный год.", yearCheck(2014));
    }

    @Test
    public void wrongYearCheck() {
        Assertions.assertEquals("Вы ввели неправильное значение для года. " +
                "Запустите программу снова, указав верный год год.", yearCheck(-2014));
    }
}
