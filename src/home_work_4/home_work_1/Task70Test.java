package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task70.createPhoneNumber;
import static home_work_1.Task70.makeArray;

public class Task70Test {
    int[] ordinary = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int[] wrong = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void checkMakeArray() {
        Assertions.assertEquals(10, makeArray("1 2 3 4 5 6 7 8 9 0").length);
    }

    @Test
    public void checkOrdinaryNumbers() {
        Assertions.assertEquals("(123) 456-7890", createPhoneNumber(ordinary));
    }

    @Test
    public void checkOrdinaryNumbersSecondMethod() {
        Assertions.assertEquals("(123) 456-7890", createPhoneNumber(makeArray("1 2 3 4 5 6 7 8 9 0")));
    }

    @Test
    public void checkWrongNumbers() {
        Assertions.assertEquals("Вы ввели неверное количество цифр, перепроверьте свои данные " +
                "и запустите программу снова.", createPhoneNumber(wrong));
    }
}

