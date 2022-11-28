package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.Task50.sleepIn;
import static home_work_1.Task50.sleepInResult;

public class Task50Test {

    @Test
    public void sleepInCheck1() {
        Assertions.assertEquals(true, sleepIn(true, true));
    }

    @Test
    public void sleepInCheck2() {
        Assertions.assertEquals(false, sleepIn(true, false));
    }

    @Test
    public void sleepInCheck3() {
        Assertions.assertEquals(true, sleepIn(false, true));
    }

    @Test
    public void sleepInCheck4() {
        Assertions.assertEquals(true, sleepIn(false, false));
    }

    @Test
    public void sleepInResult1() {
        Assertions.assertEquals("Можем спать дальше", sleepInResult(true, true));
    }

    @Test
    public void sleepInResult2() {
        Assertions.assertEquals("Пора идти на работу", sleepInResult(true, false));
    }

    @Test
    public void sleepInResult3() {
        Assertions.assertEquals("Можем спать дальше", sleepInResult(false, true));
    }

    @Test
    public void sleepInResult4() {
        Assertions.assertEquals("Можем спать дальше", sleepInResult(false, false));
    }
}