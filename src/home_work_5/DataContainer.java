package home_work_5;

import home_work_5.api.Comparator;
import java.util.Arrays;

public class DataContainer<T>{
    private T[] data;

    private int itemsInArr;

    public DataContainer(T[] data) {
        this.data = data;
    }

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

    public T[] getItems() {
        return this.data;
    }

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

    public boolean isEmpty() {
        return this.data.length == 0;
    }

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
}
