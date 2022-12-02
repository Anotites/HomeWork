package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task45.symbolCheck;

public class Task45Test {

    @Test
    public void rusCheck() {
        Assertions.assertEquals("а - это русская буква.", symbolCheck('а'));
    }

    @Test
    public void rusCapsCheck() {
        Assertions.assertEquals("А - это русская буква.", symbolCheck('А'));
    }

    @Test
    public void engCheck() {
        Assertions.assertEquals("j - это английская буква.", symbolCheck('j'));
    }

    @Test
    public void engCapsCheck() {
        Assertions.assertEquals("J - это английская буква.", symbolCheck('J'));
    }

    @Test
    public void otherCheck() {
        Assertions.assertEquals("9 - это не английская или русская буква.", symbolCheck('9'));
    }
}
