package home_work_2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число.");

        String toInsert = console.nextLine();
        String toSplit[] = toInsert.split("");
        int numbers[] = new int[toSplit.length];
        ;

        for (int i = 0; i < toInsert.length(); i++) {
            numbers[i] = Integer.parseInt(toSplit[i]);
        }

        printReversedNumber(numbers);
    }

    public static void printReversedNumber(int[] arr) {
        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 1; i > 0; i--) {
            int temporaryNumber = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temporaryNumber;
            System.out.print(arr[i]);
        }
    }
}
