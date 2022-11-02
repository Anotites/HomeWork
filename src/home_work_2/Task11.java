package home_work_2;

public class Task11 {
    public static void main(String[] args) {
        loop(5);
        recursion (5);
        System.out.println(recursion (5));
    }

    public static void loop(long number) {
        if (number <= 0) {
            System.out.println("Введите положительное число как аргумент.");
        } else {
            long result = 1;
            for (long i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println(result);
        }
    }
    public static long recursion(long number) {
        if (number <= 1) {
            return 1;
        } else {
           return number*recursion(number-1);
            }
        }
    }

