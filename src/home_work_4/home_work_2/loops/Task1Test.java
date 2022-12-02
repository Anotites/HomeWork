package home_work_4.home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.loops.Task11.loop;
import static home_work_2.loops.Task11.recursion;
import static home_work_2.loops.Task11.format;
import static home_work_2.loops.Task12.multiplication;
import static home_work_2.loops.Task13.pow;
import static home_work_2.loops.Task14.checkStackOverflow;
import static home_work_2.loops.Task15.*;
import static home_work_2.loops.Task16.multiplicationTable;


public class Task1Test {

    @Test
    public void task11TestLoop1() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", loop("5"));
    }

    @Test
    public void task11TestRecursion1() {
        Assertions.assertEquals(120, recursion("5"));
    }

    @Test
    public void task11TestRecursionFormat1() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", (format("5") + recursion("5")));
    }

    @Test
    public void task11TestLoop2() {
        Assertions.assertEquals("Введите положительное число как аргумент.", loop("-1"));
    }

    @Test
    public void task11TestRecursion2() {
        Assertions.assertEquals(1, recursion("1"));
    }

    @Test
    public void task11TestRecursionFormat2() {
        Assertions.assertEquals("1 * 2 * 3 = 6", (format("3") + recursion("3")));
    }

    @Test
    public void task11TestLoop3() {
        Assertions.assertEquals("Введите число меньше 21 (иначе произойдет переполнение).", loop("21"));
    }

    @Test
    public void task12TestMultiplication1() {
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", multiplication("181232375"));
    }

    @Test
    public void task12TestMultiplication2() {
        Assertions.assertEquals("Введено не целое число.", multiplication("99.2"));
    }

    @Test
    public void task12TestMultiplication3() {
        Assertions.assertEquals("Введено не число.", multiplication("Привет"));
    }

    @Test
    public void task13TestPowOrdinary1() {
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", pow(18, 5));
    }

    @Test
    public void task13TestPowOrdinary2() {
        Assertions.assertEquals("7.5 ^ 2 = 56.25", pow(7.5, 2));
    }

    @Test
    public void task13TestPowNegative() {
        Assertions.assertEquals("Степень должна быть положительным числом.", pow(7.5, -2));
    }

    @Test
    public void task14TestStackOverflow1() {
        Assertions.assertEquals("Число после переполнения -6289078614652622815; " +
                "число до переполнения 4052555153018976267.", checkStackOverflow(3));
    }

    @Test
    public void task14TestStackOverflow2() {
        Assertions.assertEquals("Число после переполнения 6289078614652622815; " +
                "число до переполнения -4052555153018976267.", checkStackOverflow(-3));
    }

    @Test
    public void task14TestStackOverflow3() {
        Assertions.assertEquals("Число после переполнения -1774566438301073408; " +
                "число до переполнения 1560496482665168896.", checkStackOverflow(188));
    }

    @Test
    public void task14TestStackOverflow4() {
        Assertions.assertEquals("Число после переполнения 3265617043834753317; " +
                "число до переполнения -799006685782884121.", checkStackOverflow(-19));
    }

    @Test
    public void task15TestPrintFibonacciArray1() {
        Assertions.assertEquals("0 1 1 2 3", printFibonacciArray(5));
    }

    @Test
    public void task15TestPrintFibonacciArray2() {
        Assertions.assertEquals("Количество значений из ряда " +
                "Фибоначчи должно быть больше 0.", printFibonacciArray(-5));
    }

    @Test
    public void task15TestPrintArrayWithStep1() {
        Assertions.assertEquals("2 4 6 8 10", printArrayWithStep(10, 2, 2));
    }

    @Test
    public void task15TestPrintArrayWithStep2() {
        Assertions.assertEquals("Так как ваш диапазон не делится на равные отрезки с таким шагом, " +
                "то между последним и предпоследним значением в диапазоне будет значение, " +
                "не равное шагу: 2 4 6 8 10 11", printArrayWithStep(11, 2, 2));
    }

    @Test
    public void task15TestPrintArrayWithStep3() {
        Assertions.assertEquals("Максимальное значение диапазона должно быть" +
                " больше минимального.", printArrayWithStep(10, 12, 2));
    }

    @Test
    public void task15TestPrintArrayWithStep4() {
        Assertions.assertEquals("Шаг должен быть больше 0.", printArrayWithStep(10, 2, 0));
    }

    @Test
    public void task15TestCalculateEvenNumbersFromArray() {
        Assertions.assertEquals("Выборка должна быть больше 1000 позиций", calculateEvenNumbersFromArray(1000));
    }

    @Test
    public void task15TestPrintTheBiggestNumberFromArray() {
        Assertions.assertEquals("9", printTheBiggestNumberFromArray("231956"));
    }

    @Test
    public void task15TestFindEvenAndOddNumbersFromArray() {
        Assertions.assertEquals("Количество четных цифр в числе равно 2. Количество " +
                "нечетных цифр в числе равно 4.", findEvenAndOddNumbersFromArray("231956"));
    }

    @Test
    public void task15TestPrintReversedNumber() {
        Assertions.assertEquals("659132", printReversedNumber("231956"));
    }

    String newFor16 = "\n\t\t\tТаблица умножения\n\n2 * 1 = 2\t3 * 1 = 3\t\n2 * 2 = 4\t3 * 2 = 6\t\n2 * 3 = " +
            "6\t3 * 3 = 9\t\n2 * 4 = 8\t3 * 4 = 12\t\n2 * 5 = 10\t3 * 5 = 15\t\n2 * 6 = 12\t3 * " +
            "6 = 18\t\n2 * 7 = 14\t3 * 7 = 21\t\n2 * 8 = 16\t3 * 8 = 24\t\n2 * 9 = 18\t3 * 9 = 27\t\n2 * " +
            "10 = 20\t3 * 10 = 30\t\n\nЭТО\nНУЖНО\nЗНАТЬ";

    @Test
    public void task16Test() {
        Assertions.assertEquals(newFor16, multiplicationTable(3));
    }
}

