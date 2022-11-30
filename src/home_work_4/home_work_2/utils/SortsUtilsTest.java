package home_work_4.home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.sorts.SortsMain.printArray;
import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;

public class SortsUtilsTest {

    int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
    int[] array2 = new int[]{1, 1, 1, 1};
    int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
    int[] array4 = new int[]{};
    int[] array5 = new int[]{6, 5, 4, 3, 2, 1};
    int[] array6 = new int[]{-6, 5, 88, -3, 2, 1};

    @Test
    public void checkPrintArray() {
        Assertions.assertEquals("1 2 3 4 5 6", printArray(array1));
    }

    @Test
    public void SortsUtilsTestSort1() {
        Assertions.assertEquals("1 2 3 4 5 6", printArray(sort(array1)));
    }

    @Test
    public void SortsUtilsTestSort2() {
        Assertions.assertEquals("1 1 1 1", printArray(sort(array2)));
    }

    @Test
    public void SortsUtilsTestSort3() {
        Assertions.assertEquals("1 5 9 9 9 99", printArray(sort(array3)));
    }

    @Test
    public void SortsUtilsTestSort4() {
        Assertions.assertEquals("", printArray(sort(array4)));
    }

    @Test
    public void SortsUtilsTestSort5() {
        Assertions.assertEquals("1 2 3 4 5 6", printArray(sort(array5)));
    }

    @Test
    public void SortsUtilsTestSort6() {
        Assertions.assertEquals("-6 -3 1 2 5 88", printArray(sort(array6)));
    }

    @Test
    public void SortsUtilsTestShake1() {
        Assertions.assertEquals("1 2 3 4 5 6", printArray(shake(array1)));
    }

    @Test
    public void SortsUtilsTestShake2() {
        Assertions.assertEquals("1 1 1 1", printArray(shake(array2)));
    }

    @Test
    public void SortsUtilsTestShake3() {
        Assertions.assertEquals("1 5 9 9 9 99", printArray(shake(array3)));
    }

    @Test
    public void SortsUtilsTestShake4() {
        Assertions.assertEquals("", printArray(shake(array4)));
    }

    @Test
    public void SortsUtilsTestShake5() {
        Assertions.assertEquals("1 2 3 4 5 6", printArray(shake(array5)));
    }

    @Test
    public void SortsUtilsTestShake6() {
        Assertions.assertEquals("-6 -3 1 2 5 88", printArray(shake(array6)));
    }
}
