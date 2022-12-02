package home_work_4.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.arrays.MainFor24.printArray;
import static home_work_2.arrays.Task24.*;

public class Task24Test {

    int[] array = new int[]{1, 2, 3, -4, 5, 6, 1, 8};

    @Test
    public void checkSumOfEvenPositiveNumbers() {
        Assertions.assertEquals(16, sumOfEvenPositiveNumbers(array));
    }

    @Test
    public void checkMaxNumberWithEvenIndex() {
        Assertions.assertEquals(5, maxNumberWithEvenIndex(array));
    }

    @Test
    public void checkPrintArray() {
        Assertions.assertEquals("1 2 3 -4 5 6 1 8", printArray(array));
    }

    @Test
    public void checkElementsLessThanAverage() {
        Assertions.assertEquals("1 2 -4 1", printArray(elementsLessThanAverage(array)));
    }

    String checkTwoMinElementsLine = "Два минимальных числа из массива равны -4 и 1.";

    @Test
    public void checkTwoMinElements() {
        Assertions.assertEquals(checkTwoMinElementsLine, twoMinElements(array));
    }

    int[] array1 = new int[]{12, 3, 80};

    @Test
    public void checkSumOfNumbers() {
        Assertions.assertEquals(14, sumOfNumbers(array1));
    }

    @Test
    public void checkLessArr() {
        Assertions.assertEquals("1 -4 6 1 8 0 0 0", printArray(lessArr(2, 5, array)));
    }
}

