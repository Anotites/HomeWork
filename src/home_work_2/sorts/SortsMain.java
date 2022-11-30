package home_work_2.sorts;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;
import static home_work_2.utils.ArraysUtils.arrayRandom;
import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;

public class SortsMain {
    public static void main(String[] args) {
        System.out.println("Проверка метода sort");
        int[] tempArr1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print(printArray(tempArr1));
        sort(tempArr1);
        System.out.print(" -> ");
        System.out.print(printArray(tempArr1));
        System.out.println(" ");

        int[] tempArr2 = new int[]{1, 1, 1, 1};
        System.out.print(printArray(tempArr2));
        sort(tempArr2);
        System.out.print(" -> ");
        System.out.print(printArray(tempArr2));
        System.out.println(" ");

        int[] tempArr3 = new int[]{9, 1, 5, 99, 9, 9};
        System.out.print(printArray(tempArr3));
        sort(tempArr3);
        System.out.print(" -> ");
        System.out.print(printArray(tempArr3));
        System.out.println(" ");

        int[] tempArr4 = new int[]{};
        System.out.print(printArray(tempArr4));
        sort(tempArr4);
        System.out.print(" -> ");
        System.out.print(printArray(tempArr4));
        System.out.println(" ");

        int[] tempArr5 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.print(printArray(tempArr5));
        sort(tempArr5);
        System.out.print(" -> ");
        System.out.print(printArray(tempArr5));
        System.out.println(" ");

        System.out.println("Проверка метода shake");
        int[] temp2Arr1 = new int[]{1, 2, 3, 4, 5, 6};
        System.out.print(printArray(temp2Arr1));
        shake(temp2Arr1);
        System.out.print(" -> ");
        System.out.print(printArray(temp2Arr1));
        System.out.println(" ");

        int[] temp2Arr2 = new int[]{1, 1, 1, 1};
        System.out.print(printArray(temp2Arr2));
        shake(temp2Arr2);
        System.out.print(" -> ");
        System.out.print(printArray(temp2Arr2));
        System.out.println(" ");

        int[] temp2Arr3 = new int[]{9, 1, 5, 99, 9, 9};
        System.out.print(printArray(temp2Arr3));
        shake(temp2Arr3);
        System.out.print(" -> ");
        System.out.print(printArray(temp2Arr3));
        System.out.println(" ");

        int[] temp2Arr4 = new int[]{};
        System.out.print(printArray(temp2Arr4));
        shake(temp2Arr4);
        System.out.print(" -> ");
        System.out.print(printArray(temp2Arr4));
        System.out.println(" ");

        int[] temp2Arr5 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.print(printArray(temp2Arr5));
        shake(temp2Arr5);
        System.out.print(" -> ");
        System.out.print(printArray(temp2Arr5));
        System.out.println(" ");

        System.out.println("Проверка сортировки методом sort рандомного массива");
        int[] randomArr1 = arrayRandom(50, 100);
        System.out.print(printArray(randomArr1));
        sort(randomArr1);
        System.out.print(" -> ");
        System.out.print(printArray(randomArr1));
        System.out.println(" ");

        System.out.println("Проверка сортировки методом shake рандомного массива");
        int[] randomArr2 = arrayRandom(50, 100);
        System.out.print(printArray(randomArr2));
        shake(randomArr2);
        System.out.print(" -> ");
        System.out.print(printArray(randomArr2));
        System.out.println(" ");

        System.out.println("Проверка сортировки методом sort массива, введенного через консоль");
        int[] arrFromConsole1 = arrayFromConsole();
        System.out.print(printArray(arrFromConsole1));
        sort(arrFromConsole1);
        System.out.print(" -> ");
        System.out.print(printArray(arrFromConsole1));
        System.out.println(" ");

        System.out.println("Проверка сортировки методом shake массива, введенного через консоль");
        int[] arrFromConsole2 = arrayFromConsole();
        System.out.print(printArray(arrFromConsole2));
        shake(arrFromConsole2);
        System.out.print(" -> ");
        System.out.print(printArray(arrFromConsole2));
        System.out.println(" ");
    }

    /**
     * Метод, который выводит все элементы массива в консоль.
     *
     * @param arr Массив для вывода в консоль.
     * @return Массив.
     */
    public static String printArray(int[] arr) {
        String result = "";
        for (int j : arr) {
            result = result + j + " ";
        }
        return result.trim();
    }
}
