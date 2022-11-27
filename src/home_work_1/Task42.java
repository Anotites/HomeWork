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

        System.out.println("Среднее число среди ваших чисел " + avNumber(number1, number2, number3));
    }

    /**
     * Метод, который позволяет вычислять среднее число среди 3 введенных чисел.
     *
     * @param number1 1 введенное число.
     * @param number2 2 введенное число.
     * @param number3 3 введенное число.
     * @return Среднее число.
     */
    public static int avNumber(int number1, int number2, int number3) {
        int result = 0;
        if (number1 > number2 && number1 > number3 && number2 > number3) {
            result = number2;
        } else if (number1 > number2 && number1 > number3 && number2 < number3) {
            result = number3;
        } else if (number1 > number2 && number1 < number3 && number2 < number3) {
            result = number1;
        } else if (number1 < number2 && number1 > number3 && number2 > number3) {
            result = number1;
        } else if (number1 < number2 && number1 < number3 && number2 > number3) {
            result = number3;
        } else if (number1 < number2 && number1 < number3 && number2 < number3) {
            result = number2;
        } else if (number1 == number2 && number2 == number3) {
            result = number1;
        } else if (number1 == number2 && number2 > number3) {
            result = number3;
        } else if (number1 == number3 && number2 > number3) {
            result = number3;
        } else if (number2 == number3 && number2 > number1) {
            result = number1;
        } else if (number2 == number3 && number2 < number1) {
            result = number2;
        } else if (number1 == number2 && number2 < number3) {
            result = number2;
        }
        return result;
    }
}
