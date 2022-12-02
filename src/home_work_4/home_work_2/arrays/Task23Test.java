package home_work_4.home_work_2.arrays;

import home_work_2.arrays.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task23Test {

    IArraysOperation doWhileOperation = new DoWhileOperation();
    IArraysOperation forEachOperation = new ForEachOperation();
    IArraysOperation forOperation = new ForOperation();
    IArraysOperation whileOperation = new WhileOperation();

    int[] array = new int[]{1, 2, 3, 4, 5, 6};

    @Test
    public void checkDoWhileOperation1() {
        Assertions.assertEquals("Print Elements using Do...while\n1 2 3 4 5 6",
                doWhileOperation.printElements(array));
    }

    @Test
    public void checkForEachOperation1() {
        Assertions.assertEquals("Print Elements using For each\n1 2 3 4 5 6",
                forEachOperation.printElements(array));
    }

    @Test
    public void checkForOperation1() {
        Assertions.assertEquals("Print Elements using For\n1 2 3 4 5 6",
                forOperation.printElements(array));
    }

    @Test
    public void checkWhileOperation1() {
        Assertions.assertEquals("Print Elements using While\n1 2 3 4 5 6",
                whileOperation.printElements(array));
    }

    @Test
    public void checkDoWhileOperation2() {
        Assertions.assertEquals("Print Reversed Elements using Do...while\n6 5 4 3 2 1",
                doWhileOperation.printReversedElements(array));
    }

    @Test
    public void checkForEachOperation2() {
        Assertions.assertEquals("Print Reversed Elements using For each\n6 5 4 3 2 1",
                forEachOperation.printReversedElements(array));
    }

    @Test
    public void checkForOperation2() {
        Assertions.assertEquals("Print Reversed Elements using For\n6 5 4 3 2 1",
                forOperation.printReversedElements(array));
    }

    @Test
    public void checkWhileOperation2() {
        Assertions.assertEquals("Print Reversed Elements using While\n6 5 4 3 2 1",
                whileOperation.printReversedElements(array));
    }

    @Test
    public void checkDoWhileOperation3() {
        Assertions.assertEquals("Print Every 2th Element using Do...while\n2 4 6",
                doWhileOperation.printEvery2thElement(array));
    }

    @Test
    public void checkForEachOperation3() {
        Assertions.assertEquals("Print Every 2th Element using For each\n2 4 6",
                forEachOperation.printEvery2thElement(array));
    }

    @Test
    public void checkForOperation3() {
        Assertions.assertEquals("Print Every 2th Element using For\n2 4 6",
                forOperation.printEvery2thElement(array));
    }

    @Test
    public void checkWhileOperation3() {
        Assertions.assertEquals("Print Every 2th Element using While\n2 4 6",
                whileOperation.printEvery2thElement(array));
    }
}

