package home_work_4.additional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static additional.strings.Strings.*;

public class StringsTest {

    @Test
    public void testToString11() {
        Assertions.assertEquals("минус девятьсот девяносто девять млн " +
                "девятьсот девяносто девять тыс. девятьсот девяносто девять",
                toString1(-999999999));
    }

    @Test
    public void testToString12() {
        Assertions.assertEquals("девятьсот девяносто девять млн " +
                "девятьсот девяносто девять тыс. девятьсот девяносто девять",
                toString1(999999999));
    }

    @Test
    public void testToString13() {
        Assertions.assertEquals("один", toString1(1));
    }

    @Test
    public void testNumberFinal() {
        Assertions.assertEquals("сто двадцать три тыс. " +
                "четыреста пятьдесят шесть", toString1(123456));
    }

    @Test
    public void testNumber1() {
        Assertions.assertEquals("один", number1(1));
    }

    @Test
    public void testNumber2() {
        Assertions.assertEquals("двадцать", number2(20));
    }

    @Test
    public void testNumber3() {
        Assertions.assertEquals("двести", number3(200));
    }

    @Test
    public void testNumber1ForThousands() {
        Assertions.assertEquals("одна", number1ForThousands(1));
    }

    @Test
    public void testNumberFinalForThousands() {
        Assertions.assertEquals("сто двадцать одна", numberFinalForThousands(121));
    }

    @Test
    public void testToString21() {
        Assertions.assertEquals("минус девятьсот девяносто девять млн " +
                "девятьсот девяносто девять тыс. девятьсот " +
                "девяносто девять целых десять сотых", toString2(-999999999.1));
    }

    @Test
    public void testToString22() {
        Assertions.assertEquals("девятьсот девяносто девять млн " +
                "девятьсот девяносто девять тыс. девятьсот " +
                "девяносто девять целых пятнадцать сотых", toString2(999999999.15));
    }

    @Test
    public void testToString23() {
        Assertions.assertEquals("три целых пятнадцать сотых", toString2(3.1599));
    }

    @Test
    public void testToWeek11() {
        Assertions.assertEquals("0 недель", toWeek(5));
    }

    @Test
    public void testToWeek12() {
        Assertions.assertEquals("2 недели", toWeek(15));
    }

    @Test
    public void testToWeek13() {
        Assertions.assertEquals("1 неделя", toWeek(8));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond1() {
        Assertions.assertEquals("00:00:00.005",
                toHoursMinuteSecondMillisecond(5, true));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond2() {
        Assertions.assertEquals("2 часа 6 минут 29" +
                " секунд 1 миллисекунда",
                toHoursMinuteSecondMillisecond(7589001, false));
    }

    @Test
    public void testToHoursMinuteSecondMillisecond3() {
        Assertions.assertEquals("02:06:29.001",
                toHoursMinuteSecondMillisecond(7589001, true));
    }
}
