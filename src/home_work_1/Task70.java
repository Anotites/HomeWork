package home_work_1;

import java.util.Scanner;

public class Task70 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Через пробел введите 10 цифр, которые необходимо отформатировать, не используя " +
                "запятые или прочие символы. ");

        // Формулы далее это перевод строки в массив цифр.
        String toIncert = console.nextLine();
        String toSplit[] = toIncert.split(" ");
        int toFormat[] = new int[toSplit.length];

        for (int i = 0; i < toSplit.length; i++) {
            toFormat[i] = Integer.parseInt(toSplit[i]);
        }

        // Делаю проверку на то, что пользователь ввел нужно количество цифр.
        if (toSplit.length != 10) {
            System.out.println("Вы ввели неверное количество цифр, перепроверьте свои данные " +
                    "и запустите программу снова.");
        } else {
            // Вместо массива цифры, введенного с клавиатуры, можно было прямо в параметр записать массив
            // как "new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}".
            String formattedNumber = createPhoneNumber(toFormat);
            System.out.println(formattedNumber);
        }
    }

    /**
     * Метод, форматирующий массив из 10 цифр в формат номера телефона.
     *
     * @param array Массив цифр, на основе которых мы хотим получить номер в отформатированном виде.
     * @return Строка, которая представляет собой отформатированные в нужном виде ранее введенные цифры.
     */
    public static String createPhoneNumber(int[] array) {
        return "(" + array[0] + array[1] + array[2] + ")" + " " + array[3] + array[4] + array[5] + "-"
                + array[6] + array[7] + array[8] + array[9];
    }
}

