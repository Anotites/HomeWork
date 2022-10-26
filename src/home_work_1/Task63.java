package home_work_1;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = console.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждал!");
                break;
            case "Анастасия":
                System.out.println("Я так долго тебя ждал!");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
