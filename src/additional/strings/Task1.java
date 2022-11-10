package additional.strings;

import static java.lang.Math.abs;

public class Task1 {

    public static String toString1(int number) {
        String Result = "";

        if (number > 999999999 || number < -999999999) {
            System.out.println("Вы ввели число вне заданного диапазона. Введите, " +
                    "пожалуйста, число в промежутке [-999 999 999,999 999 999] и запустите " +
                    "программу снова");
        }

        number = abs(number);
        if (number < 1000) {
            Result = NumberFinal(number);
        } else if (number < 1000000) {
            int number1 = number / 1000;
            int number2 = number % 1000;
            Result = NumberFinalForThousands(number1) + " тыс. " + NumberFinal(number2);
        } else if (number < 999999999) {
            int number1 = number / 1000000;
            int number2 = (number / 1000) % 1000;
            int number3 = number % 1000;
            if (number2 == 0) {
                Result = NumberFinal(number1) + " млн " + NumberFinal(number3);
            } else {
                Result = NumberFinal(number1) + " млн " + NumberFinalForThousands(number2) + " тыс. " + NumberFinal(number3);
            }
        }
        return Result.replaceAll(" +", " ");
    }

    public static String NumberFinal(int number) {
        String Result = "";
        if (number < 20 && number >= 0) {
            Result = Number1(number);
        } else if (number < 100 && number >= 20) {
            Result = Number2(number) + " " + Number1(number);
        } else if (number < 1000 && number >= 100) {
            Result = Number3(number) + " " + Number2(number) + " " + Number1(number);
        }
        return Result;
    }

    public static String Number1(int number1) {
        String Result1;
        if (number1 < 20 && number1 >= 0) {
            number1 = number1;
        } else {
            if (number1 % 10 == 0) {
                Result1 = "";
            } else {
                number1 = number1 % 10;
            }
        }
        Result1 = switch (number1) {
            case 1 -> "один";
            case 2 -> "два";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            case 10 -> "десять";
            case 11 -> "одиннадцать";
            case 12 -> "двенадцать";
            case 13 -> "тринадцать";
            case 14 -> "четырнадцать";
            case 15 -> "пятнадцать";
            case 16 -> "шестнадцать";
            case 17 -> "семнадцать";
            case 18 -> "восемнадцать";
            case 19 -> "девятнадцать";
            default -> "";
        };
        return Result1;
    }

    public static String Number2(int number2) {
        String Result2 = "";
        int number;
        if (number2 > 100) {
            number = (number2 % 100) / 10;
        } else {
            number = number2 / 10;
        }
        switch (number) {
            case 1 -> Result2 = "десять";
            case 2 -> Result2 = "двадцать";
            case 3 -> Result2 = "тридцать";
            case 4 -> Result2 = "сорок";
            case 5 -> Result2 = "пятьдесят";
            case 6 -> Result2 = "шестьдесят";
            case 7 -> Result2 = "семьдесят";
            case 8 -> Result2 = "восемьдесят";
            case 9 -> Result2 = "девяносто";
        }
        return Result2;
    }

    public static String Number3(int number3) {
        String Result3 = "";
        int number = number3 / 100;
        switch (number) {
            case 1 -> Result3 = "сто";
            case 2 -> Result3 = "двести";
            case 3 -> Result3 = "триста";
            case 4 -> Result3 = "четыреста";
            case 5 -> Result3 = "пятьсот";
            case 6 -> Result3 = "шестьсот";
            case 7 -> Result3 = "семьсот";
            case 8 -> Result3 = "восемьсот";
            case 9 -> Result3 = "девятьсот";
        }
        return Result3;
    }

    public static String Number1ForThousands(int number1ForThousands) {
        String Result1ForForThousands;
        if (number1ForThousands < 20 && number1ForThousands >= 0) {
            number1ForThousands = number1ForThousands;
        } else {
            if (number1ForThousands % 10 == 0) {
                Result1ForForThousands = "";
            } else {
                number1ForThousands = number1ForThousands % 10;
            }
        }
        Result1ForForThousands = switch (number1ForThousands) {
            case 0 -> "ноль";
            case 1 -> "одна";
            case 2 -> "две";
            case 3 -> "три";
            case 4 -> "четыре";
            case 5 -> "пять";
            case 6 -> "шесть";
            case 7 -> "семь";
            case 8 -> "восемь";
            case 9 -> "девять";
            case 10 -> "десять";
            case 11 -> "одиннадцать";
            case 12 -> "двенадцать";
            case 13 -> "тринадцать";
            case 14 -> "четырнадцать";
            case 15 -> "пятнадцать";
            case 16 -> "шестнадцать";
            case 17 -> "семнадцать";
            case 18 -> "восемнадцать";
            case 19 -> "девятнадцать";
            default -> "";
        };
        return Result1ForForThousands;
    }

    public static String NumberFinalForThousands(int number) {
        String Result = "";
        if (number < 20 && number >= 0) {
            Result = Number1ForThousands(number);
        } else if (number < 100 && number >= 20) {
            Result = Number2(number) + " " + Number1ForThousands(number);
        } else if (number < 1000 && number >= 100) {
            Result = Number3(number) + " " + Number2(number) + " " + Number1ForThousands(number);
        }
        return Result;
    }
}


