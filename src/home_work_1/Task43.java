package home_work_1;

import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 1 число.");
        int number1 = console.nextInt();

        System.out.println("Введите 2 число.");
        int number2 = console.nextInt();

        if (number1 == 0 || number2 == 0) {
            System.out.println("В данной задаче на ноль делить нельзя. Запустите программу снова, " +
                    "выбрав другое значение.");
        } else if (number1 % number2 == 0) {
            System.out.println("1 число без остатка делится на 2 число.");
        } else if (number2 % number1 == 0) {
            System.out.println("2 число без остатка делится на 1 число.");
        } else {
            System.out.println("Ваши числа не делятся без остатка друг на друга.");
        }
    }
}

