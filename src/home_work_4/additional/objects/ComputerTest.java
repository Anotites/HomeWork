package home_work_4.additional;

import additional.objects.computer.Computer;
import additional.objects.computer.PowerSupply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static additional.strings.Strings.*;

public class ObjectsTest {
    Computer computer = new Computer();
    PowerSupply powerSupply = new PowerSupply();

    @Test
    public void testTurningOnTheComputer() {
        Assertions.assertEquals("Computer turned on", computer.turningOnTheComputer());
    }

//    powerSupply.setExist(false);


}
