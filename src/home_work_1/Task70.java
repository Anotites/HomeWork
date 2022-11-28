package home_work_1;

import java.util.Scanner;

public class Task70 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Через пробел введите 10 цифр, которые необходимо отформатировать, не используя " +
                "запятые или прочие символы. ");
        String toInsert = console.nextLine();
        System.out.println(createPhoneNumber(makeArray(toInsert)));
    }

    /**
     * Метод, который позволяет из перечня введенных цифр (формально строки) сделать массив цифр.
     *
     * @return Массив цифр.
     */
    public static int[] makeArray(String toInsert) {
        String[] toSplit = toInsert.split(" ");
        int[] toFormat = new int[toSplit.length];

        for (int i = 0; i < toSplit.length; i++) {
            toFormat[i] = Integer.parseInt(toSplit[i]);
        }
        return toFormat;
    }

    /**
     * Метод, форматирующий массив из 10 цифр в формат номера телефона.
     * Метод также делает проверку на то, что пользователь ввел нужно количество цифр.
     *
     * @param array Массив цифр, на основе которых мы хотим получить номер в отформатированном виде.
     * @return Строка, которая представляет собой отформатированные в нужном виде ранее введенные цифры.
     */
    public static String createPhoneNumber(int[] array) {
        String result;
        if (array.length != 10) {
            result = "Вы ввели неверное количество цифр, перепроверьте свои данные " +
                    "и запустите программу снова.";
        } else {
            result = "(" + array[0] + array[1] + array[2] + ")" + " " + array[3] + array[4] + array[5] + "-"
                    + array[6] + array[7] + array[8] + array[9];
        }
        return result;
    }
}

