package home_work_4.additional.collections;

import additional.collections.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAnimal {

    Animal animal = new Animal();

    @Test
    public void testAnimalGetAge() {
        Assertions.assertTrue(animal.getAge() >= 1 && animal.getAge() <= 15);
    }

    // Остальные стандартные геттеры-сеттеры-конструкторы-toString не тестирую (так же и для Person).

}
