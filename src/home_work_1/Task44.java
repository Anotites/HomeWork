package home_work_1;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Вы хотите перевести байты в килобайты или " +
                "килобайты в байты? Для перевода в килобайты нажмите 1, для перевода в байты нажмите 2.");
        int choice = console.nextInt();
        System.out.println("Введите число.");
        int number = console.nextInt();

        System.out.println(bytesKilobytes(choice, number));
    }

    /**
     * Метод, позволяющий перевести байты в килобайты или наоборот.
     *
     * @param choice Метка, что пользователь хочет сделать.
     *               Если = 1 - перевод в килобайты нажмите 1, = 2 - перевод в байты.
     * @param number Число для перевода.
     * @return Посчитанное значение.
     */
    public static String bytesKilobytes(int choice, int number) {
        double toKilobytes = 0.0009765625;
        double toBytes = 1024;
        double result;
        String resultString;

        if (choice == 1 && number >= 0) {
            result = number * toKilobytes;
            resultString = number + " B равно " + result + " KB.";
        } else if (choice == 2 && number >= 0) {
            result = number * toBytes;
            resultString = number + " KB равно " + result + " B.";
        } else {
            resultString = "Вы выбрали неправильную опцию, попробуйте снова.";
        }
        return resultString;
    }
}


