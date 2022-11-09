package home_work_2.sorts;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;
import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;

public class SortsMain {
    public static void main(String[] args) {
        System.out.println("Проверка метода sort");
        int[] TempArr1 = new int[]{1, 2, 3, 4, 5, 6};
        printArray(TempArr1);
        sort(TempArr1);
        System.out.print(" -> ");
        printArray(TempArr1);
        System.out.println(" ");

        int[] TempArr2 = new int[]{1, 1, 1, 1};
        printArray(TempArr2);
        sort(TempArr2);
        System.out.print(" -> ");
        printArray(TempArr2);
        System.out.println(" ");

        int[] TempArr3 = new int[]{9, 1, 5, 99, 9, 9};
        printArray(TempArr3);
        sort(TempArr3);
        System.out.print(" -> ");
        printArray(TempArr3);
        System.out.println(" ");

        int[] TempArr4 = new int[]{};
        printArray(TempArr4);
        sort(TempArr4);
        System.out.print(" -> ");
        printArray(TempArr4);
        System.out.println(" ");

        int[] TempArr5 = new int[]{6, 5, 4, 3, 2, 1};
        printArray(TempArr5);
        sort(TempArr5);
        System.out.print(" -> ");
        printArray(TempArr5);
        System.out.println(" ");

        System.out.println("Проверка метода shake");
        int[] Temp2Arr1 = new int[]{1, 2, 3, 4, 5, 6};
        printArray(Temp2Arr1);
        shake(Temp2Arr1);
        System.out.print(" -> ");
        printArray(Temp2Arr1);
        System.out.println(" ");

        int[] Temp2Arr2 = new int[]{1, 1, 1, 1};
        printArray(Temp2Arr2);
        shake(Temp2Arr2);
        System.out.print(" -> ");
        printArray(Temp2Arr2);
        System.out.println(" ");

        int[] Temp2Arr3 = new int[]{9, 1, 5, 99, 9, 9};
        printArray(Temp2Arr3);
        shake(Temp2Arr3);
        System.out.print(" -> ");
        printArray(Temp2Arr3);
        System.out.println(" ");

        int[] Temp2Arr4 = new int[]{};
        printArray(Temp2Arr4);
        shake(Temp2Arr4);
        System.out.print(" -> ");
        printArray(Temp2Arr4);
        System.out.println(" ");

        int[] Temp2Arr5 = new int[]{6, 5, 4, 3, 2, 1};
        printArray(Temp2Arr5);
        shake(Temp2Arr5);
        System.out.print(" -> ");
        printArray(Temp2Arr5);
        System.out.println(" ");

        System.out.println("Проверка сортировки методом sort рандомного массива");
        int[] randomArr1 = arrayRandom(50, 100);
        printArray(randomArr1);
        sort(randomArr1);
        System.out.print(" -> ");
        printArray(randomArr1);
        System.out.println(" ");

        System.out.println("Проверка сортировки методом shake рандомного массива");
        int[] randomArr2 = arrayRandom(50, 100);
        printArray(randomArr2);
        shake(randomArr2);
        System.out.print(" -> ");
        printArray(randomArr2);
        System.out.println(" ");

        System.out.println("Проверка сортировки методом sort массива, введенного через консоль");
        int[] arrFromConsole1 = arrayFromConsole();
        printArray(arrFromConsole1);
        sort(arrFromConsole1);
        System.out.print(" -> ");
        printArray(arrFromConsole1);
        System.out.println(" ");

        System.out.println("Проверка сортировки методом shake массива, введенного через консоль");
        int[] arrFromConsole2 = arrayFromConsole();
        printArray(arrFromConsole2);
        shake(arrFromConsole2);
        System.out.print(" -> ");
        printArray(arrFromConsole2);
        System.out.println(" ");
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
