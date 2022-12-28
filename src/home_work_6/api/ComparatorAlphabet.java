package home_work_6.api;

import java.util.Comparator;

public class ComparatorAlphabet implements Comparator<String> {
    /**
     * Метод для сравнения 2 объектов String по алфавиту (используя java.util.Comparator).
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Реализация сравнения.
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}
