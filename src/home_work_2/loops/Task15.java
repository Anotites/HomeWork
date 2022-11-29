package home_work_2.loops;

import java.util.Random;

public class Task15 {

    /**
     * Метод, делающий реверс цифр числа.
     *
     * @param naturalNumber Число, реверс которого необходим.
     * @return Реверс числа.
     */
    public static String printReversedNumber(String naturalNumber) {
        String toSplit[] = naturalNumber.split("");
        int arr[] = new int[toSplit.length];

        for (int i = 0; i < naturalNumber.length(); i++) {
            arr[i] = Integer.parseInt(toSplit[i]);
        }
        String result = "";
        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 1; i > 0; i--) {
            int temporaryNumber = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temporaryNumber;
            result = result + arr[i];
        }
        return arr[0] + result;
    }

    /**
     * Метод, считающий четные и нечетные цифры числа.
     *
     * @param naturalNumber Натуральное число, для которого необходимо посчитать его четные и нечетные цифры.
     * @return Количество четных и нечетных цифр числа.
     */
    public static String findEvenAndOddNumbersFromArray(String naturalNumber) {
        String toSplit[] = naturalNumber.split("");
        int arr[] = new int[toSplit.length];

        for (int i = 0; i < naturalNumber.length(); i++) {
            arr[i] = Integer.parseInt(toSplit[i]);
        }
        int even = 0;
        int odd = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        return "Количество четных цифр в числе равно " + even + ". Количество " +
                "нечетных цифр в числе равно " + odd + ".";
    }

    /**
     * Метод, определяющий наибольшую цифру натурального числа.
     *
     * @param naturalNumber Натуральное число, для которого необходимо найти наибольшую цифру.
     * @return Наибольшая цифра натурального числа.
     */
    public static String printTheBiggestNumberFromArray(String naturalNumber) {
        String toSplit[] = naturalNumber.split("");
        int arr[] = new int[toSplit.length];

        for (int i = 0; i < naturalNumber.length(); i++) {
            arr[i] = Integer.parseInt(toSplit[i]);
        }
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temporaryNumber = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temporaryNumber;
                }
            }
        }
        return "" + arr[arr.length - 1];
    }

    /**
     * Метод, определяющий вероятность случайных четных чисел.
     *
     * @param number Количество элементов в рандомно генерируемом массиве,
     *               для которого будут определять вероятность случайных четных чисел. Выборка должна быть не менее 1000 чисел.
     * @return Подсчет четных чисел в массиве.
     */
    public static String calculateEvenNumbersFromArray(int number) {
        if (number <= 1000) {
            return "Выборка должна быть больше 1000 позиций";
        } else {
            int[] numbers = new int[number];
            Random rand = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(number);
            }

            int even = 0;
            for (int j : numbers) {
                if (j % 2 == 0) {
                    even += 1;
                }
            }
            return "Количество четных цифр в выборке из " + numbers.length + " чисел равно " + even + " (или " +
                    even * 100 / numbers.length + " процентов).";
        }
    }

    /**
     * Метод, выводящий ряд натуральных чисел в диапазоне с шагом
     *
     * @param max  Максимальное число из ряда.
     * @param min  Минимальное число из ряда.
     * @param step Шаг между 2 значениями в массиве.
     * @return Ряд чисел в диапазоне с шагом.
     */
    public static String printArrayWithStep(int max, int min, int step) {
        String result = "";

        if (min >= max) {
            return "Максимальное значение диапазона должно быть больше минимального.";
        } else if (step <= 0) {
            return "Шаг должен быть больше 0.";
        } else {
            int items;
            if ((max - min) % step == 0) {
                items = ((max - min) / step) + 1;
            } else {
                items = ((max - min) / step) + 2;
                result = "Так как ваш диапазон не делится на равные отрезки с таким шагом, " +
                        "то между последним и предпоследним значением в диапазоне будет значение, не равное шагу: ";
            }

            int[] numbers = new int[items];

            numbers[0] = min;
            numbers[numbers.length - 1] = max;

            for (int i = 1; i < (numbers.length - 1); i++) {
                numbers[i] = numbers[i - 1] + step;
            }
            for (int number : numbers) {
                result = result + number + " ";
            }
            return result.trim();
        }
    }

    /**
     * Метод, выводящий такое количество значений из ряда Фибоначчи, сколько указал пользователь.
     *
     * @param number Количество значений из ряда Фибоначчи, сколько нужно вывести.
     * @return Ряд Фибоначчи.
     */
    public static String printFibonacciArray(int number) {
        if (number <= 0) {
            return "Количество значений из ряда Фибоначчи должно быть больше 0.";
        } else {
            int[] numbers = new int[number];
            String result = "";
//        ниже код для классического ряда Фибоначчи (в условии ряд же начинается с 1 2 3, а не 0 1 1 2 3,
//         код для ряда с началом 1 2 3 написан ниже в комментарии)
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

            for (int j : numbers) {
                result = result + j + " ";
            }
            return result.trim();

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
//            result=result+numbers[i] + " ";
//        }
//        return result;

        }
    }
}
