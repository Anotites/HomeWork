package home_work_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("***новая проверка***");

        String[] data3 = new String[]{};
        DataContainer<String> container3 = new DataContainer<>(data3);
        int d = container3.add("9999");
        System.out.println("Значение элемента с индексом 0: " + container3.get(d));

        System.out.println("***новая проверка***");

        String[] data4 = {"9999"};
        DataContainer<String> container4 = new DataContainer<>(data4);
        System.out.println("Значение элемента с индексом 1: " + container4.get(1));

        System.out.println("***новая проверка***");

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

        System.out.println("***новая проверка***");

        String[] data5 = {"1", "2", "3", "777"};
        DataContainer<String> container5 = new DataContainer<>(data5);
        boolean result1 = container5.delete(null);
        System.out.println("Объект удалили: " + result1);
        System.out.println("Массив: " + Arrays.toString(container5.getItems()));

        System.out.println("***новая проверка***");

        String[] data7 = {"1", "2", "3", "777", null};
        DataContainer<String> container7 = new DataContainer<>(data7);
        boolean result3 = container7.delete(null);
        System.out.println("Объект удалили: " + result3);
        System.out.println("Массив: " + Arrays.toString(container7.getItems()));

        System.out.println("***новая проверка***");

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
    }
}

