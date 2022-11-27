package home_work_4.home_work_1;

import home_work_1.api.ICommunicationPrinter;
import home_work_1.Task61;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task61Test {

    ICommunicationPrinter iCommunicationPrinter = new Task61();

    @Test
    public void checkIfElseVasya() {
        Assertions.assertEquals("Привет!\nЯ так долго тебя ждал!", iCommunicationPrinter.welcome("Вася"));
    }

    @Test
    public void checkIfElseAnastasiya() {
        Assertions.assertEquals("Я так долго тебя ждал!", iCommunicationPrinter.welcome("Анастасия"));
    }

    @Test
    public void checkIfElseOther() {
        Assertions.assertEquals("Добрый день, а вы кто?", iCommunicationPrinter.welcome("Катя"));
    }
}
