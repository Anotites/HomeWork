package home_work_4.home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.sorts.SortsMain.printArray;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ArraysUtilsTest {

    @Test
    public void checkPrintArray() {
        Assertions.assertEquals("0 0", printArray(arrayRandom(2, 1)));
    }

    @Test
    public void checkPrintArrayLength() {
        Assertions.assertEquals(100, arrayRandom(100, 1).length);
    }

}
