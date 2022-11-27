package home_work_1;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите один символ без пробела в начале. Если будет введено более 1 символа, то" +
                " анализироваться будет только первый символ.");
        String symbolString = console.next();
        char symbolChar = symbolString.charAt(0);
        System.out.println(symbolCheck(symbolChar));
    }

    /**
     * Метод, который позволяет определить, буква или иной символ введенный символ
     *
     * @param symbolChar Символ для проверки.
     * @return Определение, является ли символ буквой.
     */
    public static String symbolCheck(char symbolChar) {
        String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int rusQuantity = rus.length();
        int engQuantity = eng.length();
        boolean result = false;
        String resultString = "";

        // Проверка на то, не является ли символ буквой русского алфавита.
        for (int i = 0; i < rusQuantity; i++) {
            if (symbolChar == rus.charAt(i)) {
                resultString = symbolChar + " - это русская буква.";
                result = true;
                break;
            }
        }

        // Проверка на то, не является ли символ буквой английского алфавита.
        if (!result) {
            for (int y = 0; y < engQuantity; y++) {
                if (symbolChar == eng.charAt(y)) {
                    resultString = symbolChar + " - это английская буква.";
                    result = true;
                    break;
                }
            }
        }

        if (!result) {
            resultString = symbolChar + " - это не английская или русская буква.";
        }
        return resultString;
    }
}









