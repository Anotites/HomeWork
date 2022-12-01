package home_work_4.additional.objects;

import additional.objects.computer.Computer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    Computer computer = new Computer();

    @Test
    public void testTurningOnTheComputer() {
        Assertions.assertEquals("Computer turned on", computer.turningOnTheComputer());
    }
}
