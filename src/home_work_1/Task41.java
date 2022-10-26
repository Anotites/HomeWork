package home_work_1;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число.");

        int number = console.nextInt();

        if (number % 2 == 1) {
            System.out.println(number + " - нечетное число");
        } else {
            System.out.println(number + " - четное число");
        }
    }
}
