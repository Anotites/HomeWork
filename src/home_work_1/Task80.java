package home_work_1;

import java.util.Scanner;

public class Task80 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите число в 10-ой системе счисления. Число должно быть" +
                "в промежутке [-128,127]");

        int initialNumber = console.nextInt();

        System.out.println(finalOrdinaryNumber(initialNumber));
    }

    /**
     * Метод, преобразующий число в 10-ной системе счисления в число в 2-ной системе счисления.
     * Метод также проверку на то, что пользователь ввел число в допустимом диапазоне.
     * Можно было бы пользоваться только кодом toBinaryString, но хотелось бы, чтобы если пользователь вводил число,
     * которое не могло бы быть byte, то программа давала бы не ошибку, а предупреждение.
     *
     * @param initialNumber Число в 10-ной системе счисления, для которого мы хотим получить представление в 2-ной системе.
     * @return Заданное число в 2-ной системе счисления.
     */
    public static String finalOrdinaryNumber(int initialNumber) {
        String result;
        if (initialNumber > 127 || initialNumber < -128) {
            result = "Вы ввели число вне заданного диапазона. Запустите программу снова и введите, " +
                    "пожалуйста, число в промежутке [-128,127].";
        } else {
            byte number = (byte) initialNumber;
            result = toBinaryString(number);
        }
        return result;
    }

    /**
     * Метод, преобразующий число в 10-ной системе счисления в число в 2-ной системе счисления.
     *
     * @param number Число в 10-ной системе счисления, для которого мы хотим получить представление в 2-ной системе.
     * @return Заданное число в 2-ной системе счисления.
     */
    public static String toBinaryString(byte number) {

        String reversedBinaryString = "";

        // Ввожу новую переменную равную number, чтобы не изменить ее изначальное значение (а в ходе дальнейших
        // вычислений оно должно меняться). Изначальное значение number мне будет нужно, чтобы получить
        // дополнительный код для отрицательных чисел.

        byte numberForLoop = number;

        // Использую i до 7, так как максимально может быть 8 повторений, так как 128 - это 2 в 7 степени
        // (+ 0 для 1).
        // Так как программа принимает только значения в формате byte, то больше чем 128
        // чисел не должно быть.

        for (int i = 0; i <= 7; i++) {
            numberForLoop = (byte) Math.abs(numberForLoop);
            int k = numberForLoop % 2;
            numberForLoop /= 2;
            reversedBinaryString = reversedBinaryString.concat(String.valueOf(k));
            if (numberForLoop < 1) {
                break;
            }
        }
        // Так как символы должны быть записаны с конца в начало, делаю реверс.
        String binaryString = new StringBuffer(reversedBinaryString).reverse().toString();
        // ход для добавления дополнительных нулей вначале, если нужно.
        if (binaryString.length() != 8) {
            int j = 8 - binaryString.length();
            for (int k = 1; k <= j; k++) {
                binaryString = "0" + binaryString;
            }
        }

        // Здесь далее не меняю сразу 0 на 1, а 1 на 0 для отрицательного числа, так как нужно делать это по
        // очереди (соответственно, получилось бы только 11111111 или 00000000,
        // поэтому ввожу промежуточные символы). Можно было бы использовать побитовый оператор ~ вместо
        // такого метода, но мне захотелось метод ниже использовать. Если бы использовала побитовый оператор ~,
        // то вместо куска кода ниже, был бы такой код.
        // if (number < 0) {
        //    for (int k = 0; k <= 7; k++) {
        //      binaryString = "" + ~binaryString.charAt(k);
        //    }
        //    if (binaryString.endsWith("0")) {
        //        binaryString = binaryString.substring(0, 7) + "1";
        //    } else {
        //       binaryString = binaryString.substring(0, 6) + "10";
        //    }
        // }

        if (number < 0) {
            // Делаю инверсию.
            binaryString = binaryString.replace('1', '2');
            binaryString = binaryString.replace('0', '3');
            binaryString = binaryString.replace('2', '0');
            binaryString = binaryString.replace('3', '1');
            // Добавляю к инверсии единицу.
            if (binaryString.endsWith("0")) {
                binaryString = binaryString.substring(0, 7) + "1";
            } else {
                binaryString = binaryString.substring(0, 6) + "10";
            }
        }

        if (number == -128) {
            binaryString = "10000000";
        }
        return binaryString;
    }
}
