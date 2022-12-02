package home_work_4.home_work_1;

import home_work_1.api.ICommunicationPrinter;
import home_work_1.Task63;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task63Test {

    ICommunicationPrinter iCommunicationPrinter = new Task63();

    @Test
    public void checkSwitchVasya() {
        Assertions.assertEquals("Привет!\nЯ так долго тебя ждал!", iCommunicationPrinter.welcome("Вася"));
    }

    @Test
    public void checkSwitchAnastasiya() {
        Assertions.assertEquals("Я так долго тебя ждал!", iCommunicationPrinter.welcome("Анастасия"));
    }

    @Test
    public void checkSwitchOther() {
        Assertions.assertEquals("Добрый день, а вы кто?", iCommunicationPrinter.welcome("Катя"));
    }
}
