package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task42.avNumber;

public class Task42Test {

    // меняю числа местами, чтобы проверить, что я учла все позиции в методе, где может стоять среднее число.

    @Test
    public void job1() {
        Assertions.assertEquals(2, avNumber(1, 2, 3));
    }

    @Test
    public void job2() {
        Assertions.assertEquals(2, avNumber(1, 3, 2));
    }

    @Test
    public void job3() {
        Assertions.assertEquals(2, avNumber(2, 1, 3));
    }

    @Test
    public void job4() {
        Assertions.assertEquals(2, avNumber(2, 3, 1));
    }

    @Test
    public void job5() {
        Assertions.assertEquals(2, avNumber(3, 1, 2));
    }

    @Test
    public void job6() {
        Assertions.assertEquals(2, avNumber(3, 2, 1));
    }

    @Test
    public void job7() {
        Assertions.assertEquals(1, avNumber(1, 1, 1));
    }

    @Test
    public void job8() {
        Assertions.assertEquals(2, avNumber(2, 2, 3));
    }

    @Test
    public void job9() {
        Assertions.assertEquals(2, avNumber(2, 3, 2));
    }

    @Test
    public void job10() {
        Assertions.assertEquals(2, avNumber(3, 2, 2));
    }

    @Test
    public void job11() {
        Assertions.assertEquals(-2, avNumber(-1, -2, -3));
    }

}
