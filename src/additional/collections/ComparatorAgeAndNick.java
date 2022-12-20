package additional.collections;

import java.util.Comparator;

public class ComparatorAgeAndNick implements Comparator<Animal> {
    /**
     * Метод для сравнения 2 объектов Animal по возрасту и кличке (по алфавиту). Вначале производится
     * сравнение по возрасту.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Реализация сравнения.
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        int result = o1.getAge() - o2.getAge();
        if (result != 0) {
            return result;
        } else {
            return o1.getNick().compareTo(o2.getNick());
        }
    }

}
