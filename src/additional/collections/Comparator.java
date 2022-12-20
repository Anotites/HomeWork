package additional.collections;

public interface Comparator<Person> {
    /**
     * Метод для сравнения 2 объектов Person.
     *
     * @param item1 Первый объект для сравнения.
     * @param item2 Второй объект для сравнения.
     * @return Реализация сравнения.
     */
    int compare(Person item1, Person item2);

}
