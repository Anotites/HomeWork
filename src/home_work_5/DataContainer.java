package home_work_5;

import home_work_5.api.Comparator;

import java.util.Arrays;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {
    private T[] data;

    private int itemsInArr;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Метод для добавления объекта в массив. В случае, если массив полон, метод копирует текущий массив в
     * массив длиной на один индекс больше и добавляет необходимый объект.
     *
     * @param item Объект для добавления.
     * @return Индекс добавленного объекта (номер позиции, в которую были вставлены данные).
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        } else {
            if (checkIfArrayFull()) {
                this.data = Arrays.copyOf(this.data, this.data.length + 1);
                this.data[this.data.length - 1] = item;
                return this.data.length - 1;
            }
            int count = 0;
            for (T element : this.data) {
                if (element == null) {
                    this.itemsInArr = count;
                    this.data[this.itemsInArr] = item;
                    this.itemsInArr++;
                    return itemsInArr - 1;
                }
                count++;
            }
            return itemsInArr - 1;
        }
    }

    /**
     * Метод, который возвращает объект из массива данных по его индексу.
     *
     * @param index Индекс объекта, который необходимо возвратить.
     * @return Объект.
     */
    public T get(int index) {
        T element = null;
        if (index < 0 || index >= this.data.length) {
            System.out.println("Вы выбрали индекс не из диапазона индексов массива. " +
                    "Измените значение.");
        } else {
            element = this.data[index];
        }
        return element;
    }

    /**
     * Метод возвращает массив из поля data.
     *
     * @return Массив.
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Метод, который возвращает количество заполненных индексов массива.
     *
     * @return Количество заполненных индексов массива.
     */
    public int size() {
        if (this.data.length == 0) {
            return this.data.length;
        } else {
            int nullFromArr = 0;
            for (T element : this.data) {
                if (element == null) {
                    nullFromArr++;
                }
            }
            return this.data.length - nullFromArr;
        }
    }

    /**
     * Метод, который возвращает true - если массив не заполнен, false - если хотя бы 1 индекс массива
     * заполнен.
     *
     * @return Ответ на вопрос, заполнен ли массив.
     */
    public boolean isEmpty() {
        return this.data.length == 0;
    }

    /**
     * Метод, который удаляет определенный элемент из поля data. В конечном массиве вместо удаленного объекта
     * пустой индекс не образуется. Удаление происходит для первого такого элемента из массива.
     *
     * @param item Объект для удаления.
     * @return Если объект удалось удалить - метод вернет true. Если нет - false.
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else {
            int check = this.data.length;
            this.itemsInArr = this.data.length;
            for (int i = 0; i < this.itemsInArr; i++) {
                if (item.equals(this.data[i])) {
                    this.data[i] = null;
                    this.itemsInArr--;
                    copyArrForDeleting();
                    break;
                }
            }
            return this.itemsInArr < check;
        }
    }

    /**
     * Метод, который удаляет элемент из поля data по индексу. В конечном массиве вместо удаленного объекта
     * пустой индекс не образуется.
     *
     * @param index Индекс объекта для удаления.
     * @return Если объект удалось удалить - метод вернет true. Если нет - false.
     */
    public boolean delete(int index) {
        if (index < 0 || index >= this.data.length) {
            System.out.println("Вы выбрали индекс не из диапазона индексов массива. " +
                    "Измените значение.");
            return false;
        } else {
            int check = this.data.length;
            this.itemsInArr = this.data.length;
            for (int i = 0; i < this.itemsInArr; i++) {
                if (this.data[index].equals(this.data[i])) {
                    this.data[index] = null;
                    this.itemsInArr--;
                    copyArrForDeleting();
                    break;
                }
            }
            return this.itemsInArr < check;
        }
    }

    /**
     * Вспомогательный метод проверки массива на заполнение.
     *
     * @return True - массив полон, пустых элементов нет. False - в массиве есть индексы, для которых
     * ячейка не заполнена.
     */
    private boolean checkIfArrayFull() {
        boolean result = true;
        for (T element : this.data) {
            if (element == null) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Вспомогательный метод для копирования массива в такой же массив, но без null.
     */
    private void copyArrForDeleting() {
        T[] tempArr = (T[]) (new Object[this.itemsInArr]);
        int tempItem = 0;
        for (int i = 0; i < this.data.length; i++, tempItem++) {
            if (this.data[i] == null) {
                tempItem--;
                continue;
            }
            tempArr[tempItem] = this.data[i];
        }
        this.data = tempArr;
    }

    /**
     * Метод занимается сортировкой данных, записанных в поле data, используя реализацию сравнения
     * из переданного объекта comparator.
     *
     * @param comparator Объект comparator - осуществляет сравнение в зависимости от
     *                   типа объектов.
     */
    public void sort(Comparator<? super T> comparator) {
        for (int i = 0; i < this.data.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < this.data.length; ++j) {
                if (comparator.compare(this.data[j], this.data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = this.data[i];
            this.data[i] = this.data[minIndex];
            this.data[minIndex] = temp;
        }
    }

    /**
     * Переопределенный метод toString(), выводит содержимое data без ячеек, в которых хранится null.
     *
     * @return Массив без ячеек, в которых хранится null.
     */
    @Override
    public String toString() {
        this.itemsInArr = this.data.length;
        for (int i = 0; i < this.itemsInArr; i++) {
            if (this.data[i] == null) {
                this.itemsInArr--;
                copyArrForDeleting();
            }
        }
        return Arrays.toString(this.data);
    }

    /**
     * Метод сортирует элементы в переданном объекте DataContainer,
     * используя реализацию сравнения, вызываемую у хранимых объектов.
     *
     * @param container Объект DataContainer для сортировки.
     * @param <T>       Тип объекта DataContainer (или тип его родительского класса).
     */
    public static <T extends Comparable<T>> void sort(DataContainer<? extends T> container) {
        T[] data = container.getItems();
        for (int i = 0; i < data.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; ++j) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    /**
     * Метод сортирует элементы в переданном объекте DataContainer, используя реализацию сравнения
     * из переданного объекта интерфейса Comparator.
     *
     * @param container  Объект DataContainer для сортировки.
     * @param comparator Объект comparator - осуществляет сравнение в зависимости от
     *                   типа объектов.
     * @param <T>        Тип объекта DataContainer (или тип его родительского класса).
     */
    public static <T> void sort(DataContainer<? extends T> container, Comparator<? super T> comparator) {
        container.sort(comparator);
    }

    /**
     * Переопределенный конструктор, который будет формировать итератор для класса DataContainer в
     * определенном типе.
     *
     * @return Итератор.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public T next() {
                return data[index++];
            }
        };
    }

    /**
     * Метод, который в результате итерации ведет данные массива в виде строки.
     *
     * @return Строка с данными массива.
     */
    public String iteratorToString() {
        T[] containers = this.data;
        StringBuilder iteratorToString = new StringBuilder();
        for (T container : containers) {
            iteratorToString.append(" ").append(container);
        }
        return iteratorToString.toString().trim();
    }
}

