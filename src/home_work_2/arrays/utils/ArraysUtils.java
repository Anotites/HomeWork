package home_work_2.arrays.utils;

import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int count = console.nextInt();

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для ячейки " + i);
            array[i] = console.nextInt();
        } return array;
    }
}

