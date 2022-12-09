package home_work_5.api;

public interface Comparator<T> {
    /**
     * Метод для сравнения 2 объектов.
     *
     * @param item1 Первый объект для сравнения.
     * @param item2 Второй объект для сравнения.
     * @return Реализация сравнения.
     */
    int compare(T item1, T item2);
}
