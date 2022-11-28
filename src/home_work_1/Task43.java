package home_work_1;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 1 число.");
        int number1 = console.nextInt();

        System.out.println("Введите 2 число.");
        int number2 = console.nextInt();

        System.out.println(divCheck(number1, number2));
    }

    /**
     * Метод, который позволяет проверить делимость одного числа на другое.
     *
     * @param number1 1 число.
     * @param number2 2 число.
     * @return Вывод делится ли одно число на второе без остатка и если нет,
     * то сообщение о невозможности остаток от их деления.
     */
    public static String divCheck(int number1, int number2) {
        String result;
        if (number2 == 0) {
            result = "В данной задаче на ноль делить нельзя. Запустите программу снова, " +
                    "выбрав другое значение.";
        } else if (number1 % number2 == 0) {
            result = "1 число без остатка делится на 2 число.";
        } else {
            result = "1 число без остатка не делится на 2 число. " +
                    "Их частное равно " + (double) number1 / number2 + ". Остаток от деления " +
                    "равен " + number1 % number2+".";
        }
        return result;
    }
}

