package home_work_1;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 1 число.");
        int number1 = console.nextInt();

        System.out.println("Введите 2 число.");
        int number2 = console.nextInt();

        System.out.println("Введите 3 число.");
        int number3 = console.nextInt();

        // Вычисляем среднее число.
        if (number1 > number2 && number1 > number3 && number2 > number3) {
            System.out.println("Среднее число среди ваших чисел " + number2);
        } else if (number1 > number2 && number1 > number3 && number2 < number3) {
            System.out.println("Среднее число среди ваших чисел " + number3);
        } else if (number1 > number2 && number1 < number3 && number2 < number3) {
            System.out.println("Среднее число среди ваших чисел " + number1);
        } else if (number1 < number2 && number1 > number3 && number2 > number3) {
            System.out.println("Среднее число среди ваших чисел " + number1);
        } else if (number1 < number2 && number1 < number3 && number2 > number3) {
            System.out.println("Среднее число среди ваших чисел " + number3);
        } else if (number1 < number2 && number1 < number3 && number2 < number3) {
            System.out.println("Среднее число среди ваших чисел " + number2);
        }
    }
}
