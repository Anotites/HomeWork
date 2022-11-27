package home_work_1;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите год для проверки.");
        int year = console.nextInt();

        System.out.println(yearCheck(year));
    }

    /**
     * Метод, который позволяет определить, високосный ли год.
     *
     * @param year Год для проверки.
     * @return Определение, високосный ли год.
     */
    public static String yearCheck(int year) {
        String result;
        if (year <= 0) {
            result = "Вы ввели неправильное значение для года. Запустите программу снова, " +
                    "указав верный год год.";
            // Високосные годы без остатка делятся на 4, проверяю, делится ли введенное число без
            // остатка на 4.
        } else if (year % 4 == 0) {
            result = year + " - это високосный год.";
        } else {
            result = year + " - это не високосный год.";
        }
        return result;
    }

}

