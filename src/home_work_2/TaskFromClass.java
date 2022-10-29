package home_work_2;

import java.util.Scanner;

public class TaskFromClass {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int count = console.nextInt();

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для ячейки " + i);
            array[i] = console.nextInt();
        }
        printArray(array);
        sort(array);
        System.out.println();
        printArray(array);
    }

    public static void sort(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                int temporaryNumber = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temporaryNumber;
               }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
