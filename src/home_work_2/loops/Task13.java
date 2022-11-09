package home_work_2.loops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, которое нужно возвести в степень.");
        Double base = console.nextDouble();
        long power = 0;
        do {
            System.out.println("Введите, в какую степень необходимо возвести число (Степень " +
                    "должна быть положительным числом).");
            power = console.nextLong();
        } while (power < 0);

        pow(base, power);

    }

    /**
     * Метод для возведения числа в степень. Данные вводятся через консоль.
     *
     * @param base  Число, которое будут возводить в степень. Может быть отрицательным.
     * @param power Степень. Не может быть отрицательной в конкретном методе.
     */
    public static void pow(double base, long power) {
        double result = base;
        for (long i = 1; i < power; i++) {
            result = result * base;
        }
        System.out.println(base + " ^ " + power + " = " + result);
    }
}
