package home_work_1;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите один символ без пробела в начале. Если будет введено более 1 символа, то" +
                "анализироваться будет только первый символ.");
        String symbolString = console.next();
        char symbolChar = symbolString.charAt(0);
        String rus = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String eng = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int rusQuantity = rus.length();
        int engQuantity = eng.length();
        boolean result = false;

        // Проверка на то, не является ли символ буквой русского алфавита.
        for (int i = 0; i < rusQuantity; i++) {
            if (symbolChar == rus.charAt(i)) {
                System.out.println(symbolChar + " - это русская буква.");
                result = true;
            }
        }

        // Проверка на то, не является ли символ буквой английского алфавита.
        if (!result) {
            for (int y = 0; y < engQuantity; y++) {
                if (symbolChar == eng.charAt(y)) {
                    System.out.println(symbolChar + " - это английская буква.");
                    result = true;
                }
            }
        }

        if (!result) {
            System.out.println(symbolChar + " - это не английская или русская буква.");
        }

    }
}








