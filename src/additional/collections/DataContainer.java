package additional.collections;

import java.util.*;
import java.util.function.Consumer;

public class DataContainer implements Iterable<Person> {
    private Collection<Person> data;

    public DataContainer(Collection<Person> collection) {
        this.data = collection;
    }

    /**
     * Метод, который заполняет коллекцию объектами Person. Поля объектов при этом
     * заполняются рандомными данными.
     *
     * @param count Количество позиций, которыми нужно заполнить коллекцию.
     */
    public void myFill(int count) {
        int check = 0;
        while (check < count) {
            this.data.add(new Person());
            check++;
        }
    }

    /**
     * Метод, который удаляет все объекты из коллекции.
     */
    public void delete() {
        this.data.clear();
    }

    /**
     * Метод, который реализует сортировку объектов в коллекции собственным методом сортировки.
     * Метод занимается сортировкой объектов, записанных в коллекцию data, используя реализацию сравнения
     * из переданного объекта comparator.
     *
     * @param comparator Объект comparator - осуществляет сравнение в зависимости от
     *                   типа объектов.
     * @return отсортированная коллекция.
     */
    public List<Person> mySort(Comparator<Person> comparator) {
        List<Person> arrayData = new ArrayList<>(this.data);
        Person[] dataArr = arrayData.toArray(new Person[0]);
        for (int i = 0; i < dataArr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < dataArr.length; ++j) {
                if (comparator.compare(dataArr[j], dataArr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Person temp = dataArr[i];
            dataArr[i] = dataArr[minIndex];
            dataArr[minIndex] = temp;
        }
        return Arrays.asList(dataArr);
    }

    @Override
    public String toString() {
        return "" + data;
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Person> spliterator() {
        return Iterable.super.spliterator();
    }
}
