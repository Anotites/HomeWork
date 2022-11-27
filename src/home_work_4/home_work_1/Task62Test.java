package home_work_4.home_work_1;

import home_work_1.api.ICommunicationPrinter;
import home_work_1.Task62;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task62Test {

    ICommunicationPrinter iCommunicationPrinter = new Task62();

    @Test
    public void checkElseIfVasya() {
        Assertions.assertEquals("Привет!\nЯ так долго тебя ждал!", iCommunicationPrinter.welcome("Вася"));
    }

    @Test
    public void checkElseIfAnastasiya() {
        Assertions.assertEquals("Я так долго тебя ждал!", iCommunicationPrinter.welcome("Анастасия"));
    }

    @Test
    public void checkElseIfOther() {
        Assertions.assertEquals("Добрый день, а вы кто?", iCommunicationPrinter.welcome("Катя"));
    }
}
