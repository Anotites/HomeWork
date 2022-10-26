package home_work_1;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите год для проверки.");
        int year = console.nextInt();

        if (year <= 0) {
            System.out.println("Вы ввели неправильное значение для года. Запустите программу снова, " +
                    "указав верный год год.");
            // Високосные годы без остатка делятся на 4, проверяю, делится ли введенное число без
            // остатка на 4.
        } else if (year % 4 == 0) {
            System.out.println(year + " - это високосный год.");
        } else {
            System.out.println(year + " - это не високосный год.");
        }
    }
}

