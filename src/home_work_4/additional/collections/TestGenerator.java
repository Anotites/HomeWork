package home_work_4.additional.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static additional.collections.Generator.*;

public class TestGenerator {

    private final int checkLength1 = randomDiffForNameAndNickAndPersonNick().length();

    @Test
    public void testRandomDiffForNameAndNickAndPersonNick() {
        Assertions.assertTrue(checkLength1 >= 1 && checkLength1 <= 10);
    }

    private final int checkLength2 = randomDiffRusForNameAndNick().length();

    @Test
    public void testRandomDiffRusForNameAndPersonNick() {
        Assertions.assertTrue(checkLength2 >= 1 && checkLength2 <= 10);
    }

    private final int checkLength3 = randomDiffEngForPersonNick().length();

    @Test
    public void testRandomDiffEngForPersonNick() {
        Assertions.assertTrue(checkLength3 >= 1 && checkLength3 <= 10);
    }

    private final String names = "Светлана Дмитрий Елена " +
            "Даниил Вадим Максим Оксана Владислав Никита " +
            "Екатерина Артем Иван Ольга Кирилл Егор Елизавета " +
            "Илья Артем Виктория Андрей";

    @Test
    public void testRandomName() {
        Assertions.assertTrue(names.contains(randomName()));
    }

    @Test
    public void testRandomNameFromFile() {
        Assertions.assertTrue(names.contains(randomNameFromFile()));
    }

    private final String animals = "Шарик Жучка Мурзик Клубок Лада Рыжик Снежок Мурка Котик " +
            "Мухтар Альба Барс Серенький Персик";

    @Test
    public void testRandomNickForAnimal() {
        Assertions.assertTrue(animals.contains(randomNickForAnimal()));
    }

    @Test
    public void testRandomNickForAnimalFromFile() {
        Assertions.assertTrue(animals.contains(randomNickForAnimalFromFile()));
    }

    @Test
    public void testRandomPersonNickFromFile() {
        String personNicks = "Светлана11 Дмитрий222 Елена33 Даниил4 " +
                "Вадим45 Максим55 Оксана666 Владислав2 Никита45 Екатерина54 " +
                "Артем53 Иван554 Ольга53 Кирилл53 Егор534 Елизавета5343 Илья534 " +
                "Артем543 Виктория54 Андрей534";
        Assertions.assertTrue(personNicks.contains(randomPersonNickFromFile()));
    }

    private final int checkLength4 = randomDiffFrom5To10ForPassword().length();

    @Test
    public void testRandomDiffFrom5To10ForPassword() {
        Assertions.assertTrue(checkLength4 >= 5 && checkLength4 <= 10);
    }

    @Test
    public void testDataFromFiles() {
        Assertions.assertEquals("[" + names + "]",
                Arrays.toString(dataFromFiles("names.txt")).replace(",", ""));
    }

    @Test
    public void testMakeArray() {
        Assertions.assertEquals(2, makeArray("1 2").length);
    }
}
