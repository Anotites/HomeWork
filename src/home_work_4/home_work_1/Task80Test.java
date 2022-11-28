package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task80.finalOrdinaryNumber;
import static home_work_1.Task80.toBinaryString;

public class Task80Test {
    byte a = 42;
    byte b = -42;
    byte c = 127;
    byte d = -128;

    @Test
    public void check42() {
        Assertions.assertEquals("00101010", toBinaryString(a));
    }

    @Test
    public void checkMinus42() {
        Assertions.assertEquals("11010110", toBinaryString(b));
    }

    @Test
    public void check127() {
        Assertions.assertEquals("01111111", toBinaryString(c));
    }

    @Test
    public void checkMinus128() {
        Assertions.assertEquals("10000000", toBinaryString(d));
    }

    @Test
    public void checkFinalOrdinaryNumber127() {
        Assertions.assertEquals("01111111", finalOrdinaryNumber(127));
    }

    @Test
    public void checkFinalOrdinaryNumberOutOfRange() {
        Assertions.assertEquals("Вы ввели число вне заданного диапазона. " +
                "Запустите программу снова и введите, пожалуйста, " +
                "число в промежутке [-128,127].", finalOrdinaryNumber(128));
    }
}

