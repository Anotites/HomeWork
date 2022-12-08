package home_work_5;

import home_work_5.api.ComparatorInteger;
import home_work_5.api.ComparatorString;

import java.util.Arrays;

import static home_work_5.DataContainer.sort;

public class Main {
    public static void main(String[] args) {

        System.out.println("***новая проверка добавления***");

        String[] data1 = new String[]{};
        DataContainer<String> container1 = new DataContainer<>(data1);
        System.out.println("Контейнер пустой: " + container1.isEmpty());
        System.out.println("Количество заполненных индексов в массиве: " + container1.size());
        int a = container1.add("777");
        System.out.println("Текущий индекс добавленного элемента: " + a + "; ");
        System.out.println("Контейнер пустой: " + container1.isEmpty());
        System.out.println("Количество заполненных индексов в массиве: " + container1.size());
        System.out.println("Значение элемента с индексом 0: " + container1.get(0));
        System.out.println("Массив: " + Arrays.toString(container1.getItems()));

        System.out.println("***новая проверка добавления***");

        String[] data3 = new String[]{};
        DataContainer<String> container3 = new DataContainer<>(data3);
        int d = container3.add("9999");
        System.out.println("Значение элемента с индексом 0: " + container3.get(d));

        System.out.println("***новая проверка***");

        String[] data4 = {"9999"};
        DataContainer<String> container4 = new DataContainer<>(data4);
        System.out.println("Значение элемента с индексом 1: " + container4.get(1));

        System.out.println("***новая проверка добавления***");

        String[] data2 = new String[6];
        data2[0] = "1";
        data2[2] = "3";
        DataContainer<String> container2 = new DataContainer<>(data2);
        System.out.println("Контейнер пустой: " + container2.isEmpty());
        System.out.println("Количество заполненных индексов в массиве: " + container2.size());
        int b = container2.add("777");
        System.out.println("Текущий индекс добавленного элемента: " + b + "; ");
        System.out.println("Контейнер пустой: " + container2.isEmpty());
        System.out.println("Количество заполненных индексов в массиве: " + container2.size());
        System.out.println("Значение элемента с индексом 1: " + container2.get(1));

        System.out.println("***новая проверка удаления по индексу***");

        Integer[] data51 = {1, 2, 3, 777};
        DataContainer<Integer> container51 = new DataContainer<>(data51);
        boolean result111 = container51.delete(3);
        System.out.println("Объект удалили: " + result111);
        System.out.println("Массив: " + Arrays.toString(container51.getItems()));

        System.out.println("***новая проверка удаления объекта***");

        Integer[] data52 = {1, 2, 3, 777};
        DataContainer<Integer> container52 = new DataContainer<>(data52);
        boolean result12 = container52.delete(data52[3]);
        System.out.println("Объект удалили: " + result12);
        System.out.println("Массив: " + Arrays.toString(container52.getItems()));

        System.out.println("***новая проверка удаления***");

        String[] data5 = {"1", "2", "3", "777"};
        DataContainer<String> container5 = new DataContainer<>(data5);
        boolean result1 = container5.delete(null);
        System.out.println("Объект удалили: " + result1);
        System.out.println("Массив: " + Arrays.toString(container5.getItems()));

        System.out.println("***новая проверка удаления***");

        String[] data7 = {"1", "2", "3", "777", null};
        DataContainer<String> container7 = new DataContainer<>(data7);
        boolean result3 = container7.delete(null);
        System.out.println("Объект удалили: " + result3);
        System.out.println("Массив: " + Arrays.toString(container7.getItems()));

        System.out.println("***новая проверка удаления***");

        String[] data6 = {"1", "2", "3", "777"};
        DataContainer<String> container6 = new DataContainer<>(data6);

        boolean result4 = container6.delete("111");
        System.out.println("Объект удалили: " + result4);
        System.out.println("Массив: " + Arrays.toString(container6.getItems()));

        boolean result2 = container6.delete("777");
        System.out.println("Объект удалили: " + result2);
        System.out.println("Массив: " + Arrays.toString(container6.getItems()));

        System.out.println("***новая проверка***");

        String[] data8 = {"1", "2", "3", "777", "3"};
        DataContainer<String> container8 = new DataContainer<>(data8);

        boolean result5 = container8.delete("3");
        System.out.println("Объект удалили: " + result5);
        System.out.println("Массив: " + Arrays.toString(container8.getItems()));

        String[] data9 = {"1", "2", "3", "777"};
        DataContainer<String> container9 = new DataContainer<>(data9);

        boolean result9 = container9.delete(3);
        System.out.println("Объект удалили: " + result9);
        System.out.println("Массив: " + Arrays.toString(container9.getItems()));

        String[] data10 = {"1", "2", "3", "777"};
        DataContainer<String> container10 = new DataContainer<>(data10);

        boolean result10 = container10.delete(9);
        System.out.println("Объект удалили: " + result10);
        System.out.println("Массив: " + Arrays.toString(container10.getItems()));

        String[] data11 = {"1", "2", "3", "777"};
        DataContainer<String> container11 = new DataContainer<>(data11);

        boolean result11 = container11.delete(2);
        System.out.println("Объект удалили: " + result11);
        System.out.println("Массив: " + Arrays.toString(container11.getItems()));

        System.out.println("***новая проверка ComparatorInteger***");

        Integer[] data12 = {3, 1, 3, 777};
        DataContainer<Integer> container12 = new DataContainer<>(data12);
        ComparatorInteger comparatorInteger = new ComparatorInteger();

        container12.sort(comparatorInteger);
        System.out.println("Массив: " + Arrays.toString(container12.getItems()));

        System.out.println("***новая проверка comparatorString***");

        String[] data13 = {"i", "hello", "1", "Как домашка"};
        DataContainer<String> container13 = new DataContainer<>(data13);
        ComparatorString comparatorString = new ComparatorString();

        container13.sort(comparatorString);
        System.out.println("Массив: " + Arrays.toString(container13.getItems()));

        System.out.println("***новая проверка toString***");

        Integer[] data14 = {1, 2, 3, 777, 3};
        DataContainer<Integer> container14 = new DataContainer<>(data14);

        System.out.println("Массив: " + container14);

        System.out.println("***новая проверка toString***");

        Integer[] data15 = {1, 2, 3, null};
        DataContainer<Integer> container15 = new DataContainer<>(data15);

        System.out.println("Массив: " + container15);

        System.out.println("***новая проверка toString***");

        Integer[] data16 = {};
        DataContainer<Integer> container16 = new DataContainer<>(data16);

        System.out.println("Массив: " + container16);

        System.out.println("***новая проверка для 12 задания***");

        Integer[] data17 = {3, 1, 3, 777};
        DataContainer<Integer> container17 = new DataContainer<>(data17);
        ComparatorInteger comparatorInteger17 = new ComparatorInteger();

        sort(container17, comparatorInteger17);
        System.out.println("Массив: " + Arrays.toString(container17.getItems()));

        System.out.println("***новая проверка для 12 задания***");

        String[] data18 = {"i", "hello", "1", "Как домашка"};
        DataContainer<String> container18 = new DataContainer<>(data18);
        ComparatorString comparatorString18 = new ComparatorString();

        sort(container18, comparatorString18);
        System.out.println("Массив: " + Arrays.toString(container18.getItems()));

        System.out.println("***новая проверка для 11 задания***");

        //Для строк метод в классе String сортирует по алфавиту.
        String[] data19 = {"Семенов", "Петров", "Иванов", "Соколов", "Арбузов"};
        DataContainer<String> container19 = new DataContainer<>(data19);

        sort(container19);
        System.out.println("Массив: " + Arrays.toString(container19.getItems()));

        System.out.println("***новая проверка для 11 задания***");

        Integer[] data20 = {3, 1, 3, 777};
        DataContainer<Integer> container20 = new DataContainer<>(data20);

        sort(container20);
        System.out.println("Массив: " + Arrays.toString(container20.getItems()));

        System.out.println("***новая проверка для 13 задания***");

        Integer[] data21 = {2, 1, 3, 777};
        DataContainer<Integer> containers = new DataContainer<>(data21);

        for (Integer container : containers) {
            System.out.print(container + " ");
        }
    }
}


