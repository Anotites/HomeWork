package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {

    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 4 раза (при помощи разных циклов: do....while, while, for, foreach).
     */
    public static void printElements() {
        int[] arr = arrayFromConsole();
        int i = 0;
        int b = 0;

        do {
            System.out.print(arr[b] + " ");
            b++;
        } while (b <= arr.length - 1);
        System.out.println("");

        while (i <= arr.length - 1) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива, элементы которого будут
     * введены через консоль.
     * Каждый второй элемент будет выведен 4 раза (при помощи разных циклов: do....while, while, for, foreach).
     */
    public static void printEvery2thElement() {
        int[] arr = arrayFromConsole();
        int i = 0;
        int b = 0;

        do {
            b++;
            System.out.print(arr[b] + " ");
            b++;
        } while (b < arr.length - 1);
        System.out.println("");

        while (i < arr.length - 1) {
            i++;
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("");

        for (int j = 1; j < arr.length; j = j + 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        int a = 0;
        for (int element : arr) {
            a++;
            if (a % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 4 раза (при помощи разных циклов:
     * do....while, while, for, foreach).
     */
    public static void printReversedElements() {
        int[] arr = arrayFromConsole();
        int i = arr.length - 1;
        int b = arr.length - 1;

        do {
            System.out.print(arr[b] + " ");
            b--;
        } while (b >= 0);
        System.out.println("");

        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println("");

        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        // Для for each я придумала еще такой супер странный метод, но решила оставить более логичный (следует далее).
        // Оставляю странный метод в комментариях.
//        String result = "";
//        for (int element : arr) {
//            result = element + "\r\n" + result;
//        }
//        String resultNew = result.replace("\r", "");
//        String resultFinal = resultNew.replace("\n", " ");
//        System.out.print(resultFinal);
//        System.out.println("");

        int[] reversedArr = new int[arr.length];
        int k = arr.length;

        for (int element : arr) {
            k--;
            reversedArr[k] = element;
        }
        for (int element : reversedArr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
