package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task41.oddCheck;

public class Task41Test {

    @Test
    public void check1Number() {
        Assertions.assertEquals("1 - нечетное число.", oddCheck(1, 2));
    }

    @Test
    public void check2Number() {
        Assertions.assertEquals("1 - нечетное число.", oddCheck(2, 1));
    }
}

