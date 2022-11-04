package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выберите опцию, что вы хотите узнать:\n" +
                    "\t1. Найти наибольшую цифру натурального числа\n" +
                    "\t2. Вероятность четных случайных чисел\n" +
                    "\t3. Посчитать четные и нечетные цифры числа\n" +
                    "\t4. Ряд Фибоначчи\n" +
                    "\t5. Вывести ряд чисел в диапазоне с шагом\n" +
                    "\t6. Переворот числа");
            choice = console.nextInt();
        } while (choice < 1 || choice > 6);

        if (choice == 2) {
            Scanner consoleFor2 = new Scanner(System.in);
            int number;
            do {
                System.out.println("Какого размера вы хотите выборку, чтобы проверить корректность работы " +
                        "генератора псевдослучайных чисел. Выборка должна быть не менее 1000 чисел.");
                number = consoleFor2.nextInt();
            } while (number < 1000);

            System.out.println("Вы ввели " + number + ".");

            int numbers[] = new int[number];
            Random rand = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(number);
            }

            calculateEvenNumbersFromArray(numbers);

        } else if (choice == 4) {
            Scanner consoleFor4 = new Scanner(System.in);
            int number;

            do {
                System.out.println("Cколько элементов ряда Фибоначчи вы хотите получить?");
                number = consoleFor4.nextInt();
            } while (number <= 0);

            System.out.println("Вы ввели " + number + ".");

            printFibonacciArray(number);

        } else if (choice == 5) {
            Scanner consoleFor5 = new Scanner(System.in);
            int max;
            int min;
            int step;

            do {
                System.out.println("Введите число, что будет максимальным в диапазоне.");
                max = consoleFor5.nextInt();
            } while (max <= 0);

            do {
                System.out.println("Введите число, что будет минимальным в диапазоне.");
                min = console.nextInt();
            } while (min <= 0 || min > max);

            do {
                System.out.println("Введите шаг.");
                step = console.nextInt();
            } while (step <= 0);

            System.out.println("Вы ввели данные для диапазона с максимальным значением " + max + ", с минимальным " +
                    "значением " + min + ", с шагом " + step + ".");

            printArrayWithStep(max, min, step);

        } else if (choice == 6 || choice == 3 || choice == 1) {
            Scanner consoleFor136 = new Scanner(System.in);
            System.out.println("Введите натуральное число.");

            String toInsert = consoleFor136.nextLine();
            String toSplit[] = toInsert.split("");
            int numbers[] = new int[toSplit.length];

            for (int i = 0; i < toInsert.length(); i++) {
                numbers[i] = Integer.parseInt(toSplit[i]);
            }
            if (choice == 6) {
                printReversedNumber(numbers);
            } else if (choice == 3) {
                findEvenAndOddNumbersFromArray(numbers);
            } else if (choice == 1) {
                printTheBiggestNumberFromArray(numbers);
            }
        }
    }

    public static void printReversedNumber(int[] arr) {
        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 1; i > 0; i--) {
            int temporaryNumber = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temporaryNumber;
            System.out.print(arr[i]);
        }
    }

    public static void findEvenAndOddNumbersFromArray(int[] arr) {
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Even += 1;
            } else {
                Odd += 1;
            }
        }
        System.out.println("Количество четных цифр в числе равно " + Even + ". Количество " +
                "нечетных цифр в числе равно " + Odd + ".");
    }

    public static void printTheBiggestNumberFromArray(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temporaryNumber = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temporaryNumber;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void calculateEvenNumbersFromArray(int[] arr) {
        int Even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Even += 1;
            }
        }
        System.out.println("Количество четных цифр в выборке из " + arr.length + " чисел равно " + Even + " (или " +
                Even * 100 / arr.length + " процентов).");
    }

    public static void printArrayWithStep(int max, int min, int step) {
        int items = 0;

        if ((max - min) % step == 0) {
            items = ((max - min) / step) + 1;
        } else {
            items = ((max - min) / step) + 2;
            System.out.println("Так как ваш диапазон не делится на равные отрезки с таким шагом, " +
                    "то между последним и предпоследним значением в диапазоне будет значение, не равное шагу.");
        }

        int numbers[] = new int[items];

        numbers[0] = min;
        numbers[numbers.length - 1] = max;

        for (int i = 1; i < (numbers.length - 1); i++) {
            numbers[i] = numbers[i - 1] + step;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void printFibonacciArray(int number) {
        int numbers[] = new int[number];

        //ниже код для классического ряда Фибоначчи (в условии ряд же начинается с 1 2 3, а не 0 1 1 2 3,
        // код для ряда с началом 1 2 3 написан ниже в комментарии)
        if (number == 1) {
            numbers[0] = 0;
        } else if (number == 2) {
            numbers[0] = 0;
            numbers[1] = 1;
        } else {
            numbers[0] = 0;
            numbers[1] = 1;
            for (int i = 2; i < (number); i++) {
                numbers[i] = numbers[i - 2] + numbers[i - 1];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

//        if (number == 1) {
//            numbers[0] = 1;
//        } else if (number == 2) {
//            numbers[0] = 1;
//            numbers[1] = 2;
//        } else {
//            numbers[0] = 1;
//            numbers[1] = 2;
//            for (int i = 2; i < (number); i++) {
//                numbers[i] = numbers[i - 2] + numbers[i - 1];
//            }
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
    }
}
