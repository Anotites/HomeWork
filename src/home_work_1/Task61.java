package home_work_1;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = console.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я так долго тебя ждал!");
        } else {
            if (name.equals("Анастасия")) {
                System.out.println("Я так долго тебя ждал!");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
