package home_work_1;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Вы хотите перевести байты в килобайты или " +
                "килобайты в байты? Для перевода в килобайты нажмите 1, для перевода в байты нажмите 2.");
        int choice = console.nextInt();

        double toKilobytes = 0.0009765625;
        double toBytes = 1024;
        double result;

        if (choice == 1) {
            System.out.println("Введите число.");
            int number = console.nextInt();
            result = number * toKilobytes;
            System.out.println(number + " B равно " + result + " KB.");
        } else if (choice == 2) {
            System.out.println("Введите число.");
            int number = console.nextInt();
            result = number * toBytes;
            System.out.println(number + " KB равно " + result + " B.");
        } else {
            System.out.println("Вы выбрали неправильную опцию, попробуйте снова.");
        }
    }
}

