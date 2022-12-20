package additional.collections;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Animal> {
    /**
     * Метод для сравнения 2 объектов Animal по возрасту.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Реализация сравнения.
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }

}
