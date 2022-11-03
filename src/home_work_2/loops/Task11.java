package home_work_2.loops;

public class Task11 {
    public static void main(String[] args) {
        long number = 10;
        long numberWithLoop = loop(number);
        long numberWithRecursion = recursion(number);
        System.out.println(numberWithLoop);
        System.out.println(numberWithRecursion);
    }

    public static long loop(long number) {
        long result = 1;
        if (number <= 0) {
            System.out.println("Введите положительное число как аргумент.");
        } else {
            for (long i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }

    public static long recursion(long number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * recursion(number - 1);
        }
    }
}

