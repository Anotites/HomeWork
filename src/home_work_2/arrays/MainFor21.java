package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;

public class MainFor21 {
    public static void main(String[] args) {
        int[] container1 = arrayFromConsole();
        printArray(container1);
        System.out.println("");

        int[] container2 = arrayRandom(5, 100);
        printArray(container2);
        System.out.println("");
    }

    /**
     * Метод, который выводит все элементы массива в консоль.
     *
     * @param arr Массив для вывода в консоль.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
