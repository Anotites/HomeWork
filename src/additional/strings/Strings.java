package additional.strings;

import static java.lang.Math.abs;

public class Task1 {

    public static String toString1(int numberInserted) {
        String result = "";

        if (numberInserted > 999999999 || numberInserted < -999999999) {
            System.out.println("Вы ввели число вне заданного диапазона. Введите, " +
                    "пожалуйста, число в промежутке [-999 999 999,999 999 999] и запустите " +
                    "программу снова");
        }
        int number = abs(numberInserted);
        if (number < 1000) {
            result = numberFinal(number);
        } else if (number < 1000000) {
            int number1 = number / 1000;
            int number2 = number % 1000;
            result = numberFinalForThousands(number1) + " тыс. " + numberFinal(number2);
        } else if (number < 999999999) {
            int number1 = number / 1000000;
            int number2 = (number / 1000) % 1000;
            int number3 = number % 1000;
            if (number2 == 0) {
                result = numberFinal(number1) + " млн " + numberFinal(number3);
            } else {
                result = numberFinal(number1) + " млн " + numberFinalForThousands(number2) + " тыс. " + numberFinal(number3);
            }
        }
        result = result.replaceAll(" +", " ");
        if (numberInserted < 0) {
            result = "минус " + result;
        }
        return result;
    }

    public static String numberFinal(int number) {
        String result = "";
        if (number < 20 && number >= 0) {
            result = number1(number);
        } else if (number < 100 && number >= 20) {
            result = number2(number) + " " + number1(number);
        } else if (number < 1000 && number >= 100) {
            result = number3(number) + " " + number2(number) + " " + number1(number);
        }
        return result;
    }

    public static String number1(int number1) {
        String result1;
        if (number1 < 20 && number1 >= 0) {
            number1 = number1;
        } else {
            if (number1 % 10 == 0) {
                result1 = "";
                number1 = number1 % 100;
            } else {
                if (number1 % 100 > 1 && number1 % 100 < 20) {
                    number1 = number1 % 100;
                } else {
                    number1 = number1 % 10;
                }
            }
        }
        result1 = switch (number1) {
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
        return result1;
    }

    public static String number2(int number2) {
        String result2 = "";
        int number = 0;
        if (number2 > 100) {
            if (number2 % 100 > 1 && number2 % 100 < 20) {
                result2 = "";
            } else {
                number = (number2 % 100) / 10;
            }
        } else {
            number = number2 / 10;
        }
        switch (number) {
            case 2 -> result2 = "двадцать";
            case 3 -> result2 = "тридцать";
            case 4 -> result2 = "сорок";
            case 5 -> result2 = "пятьдесят";
            case 6 -> result2 = "шестьдесят";
            case 7 -> result2 = "семьдесят";
            case 8 -> result2 = "восемьдесят";
            case 9 -> result2 = "девяносто";
        }
        return result2;
    }

    public static String number3(int number3) {
        String result3 = "";
        int number = number3 / 100;
        switch (number) {
            case 1 -> result3 = "сто";
            case 2 -> result3 = "двести";
            case 3 -> result3 = "триста";
            case 4 -> result3 = "четыреста";
            case 5 -> result3 = "пятьсот";
            case 6 -> result3 = "шестьсот";
            case 7 -> result3 = "семьсот";
            case 8 -> result3 = "восемьсот";
            case 9 -> result3 = "девятьсот";
        }
        return result3;
    }

    public static String number1ForThousands(int number1ForThousands) {
        String result1ForForThousands;
        if (number1ForThousands < 20 && number1ForThousands >= 0) {
            number1ForThousands = number1ForThousands;
        } else {
            if (number1ForThousands % 10 == 0) {
                result1ForForThousands = "";
                number1ForThousands = number1ForThousands % 100;
            } else {
                if (number1ForThousands % 100 > 1 && number1ForThousands % 100 < 20) {
                    number1ForThousands = number1ForThousands % 100;
                } else {
                    number1ForThousands = number1ForThousands % 10;
                }
            }
        }
        result1ForForThousands = switch (number1ForThousands) {
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
        return result1ForForThousands;
    }

    public static String numberFinalForThousands(int number) {
        String result = "";
        if (number < 20 && number >= 0) {
            result = number1ForThousands(number);
        } else if (number < 100 && number >= 20) {
            result = number2(number) + " " + number1ForThousands(number);
        } else if (number < 1000 && number >= 100) {
            result = number3(number) + " " + number2(number) + " " + number1ForThousands(number);
        }
        return result;
    }

    public static String toString2(double number) {
        String result = "" + number;
        String stringInteger;
        String stringHundredths;

        if (number < 10000000 && number > 0 || (number > -10000000 && number < 0)) {
            int only2decimal = result.indexOf(".") + 1;
            stringInteger = result.substring(0, only2decimal - 1);
            stringHundredths = result.substring(only2decimal, only2decimal + 2);
        } else {
            result = result.replaceAll("\\.", "");
            int fullNumber = result.indexOf("E");
            String stringQuantity = result.substring(fullNumber + 1);
            int intQuantity;
            if (number < 0) {
                intQuantity = Integer.parseInt(stringQuantity) + 2;
            } else {
                intQuantity = Integer.parseInt(stringQuantity) + 1;
            }
            stringInteger = result.substring(0, intQuantity);
            stringHundredths = result.substring(intQuantity, intQuantity + 2);
        }

        int intInteger = Integer.parseInt(stringInteger);
        int intHundredths = Integer.parseInt(stringHundredths);

        stringInteger = Task1.toString1(intInteger);
        stringHundredths = Task1.toString1(intHundredths);

        result = stringInteger + " целых " + stringHundredths + " сотых";
        result = result.replaceAll(" +", " ");
        return result;
    }

    public static String toWeek(int day) {
        day = day / 7;
        String dayName = null;

        if (day % 100 == 11 || day % 100 == 12 || day % 100 == 13 || day % 100 == 14 ||
                day % 10 >= 5 && day % 10 <= 9 || day % 10 <= 0) {
            dayName = " недель ";
        } else if (day % 10 == 2 || day % 10 == 3 || day % 10 == 4) {
            dayName = " недели ";
        } else if (day % 10 == 1) {
            dayName = " неделя ";
        }

        return day + dayName;
    }

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        long sec = millisecond / 1000;
        millisecond = millisecond % 1000;
        long second = sec % 60;
        long min = sec / 60;
        long minute = min % 60;
        long hour = min / 60;

        String result;
        String milliseconds;
        String seconds;
        String minutes;
        String hours;
        String hourName = " ч. ";
        String minuteName = " м. ";
        String secondName = " с. ";
        String millisecondName = " мс. ";

        if (second == 2 || second == 3 || second == 4 || second == 22 || second == 23 || second == 24 ||
                second == 32 || second == 33 || second == 34 || second == 42 || second == 43 || second == 44
                || second == 52 || second == 53 || second == 54) {
            secondName = " секунды ";
        } else if (second == 1 || second == 21 || second == 31 || second == 41 || second == 51) {
            secondName = " секунда ";
        } else if (second >= 5 && second <= 20 || second == 0 || second >= 25 && second <= 30 ||
                second >= 35 && second <= 40 || second >= 45 && second <= 50 || second >= 55 && second <= 59) {
            secondName = " секунд ";
        }

        if (millisecond % 100 == 11 || millisecond % 100 == 12 || millisecond % 100 == 13 || millisecond % 100 == 14 ||
                millisecond % 10 >= 5 && millisecond % 10 <= 9 || millisecond % 10 <= 0) {
            millisecondName = " миллисекунд ";
        } else if (millisecond % 10 == 2 || millisecond % 10 == 3 || millisecond % 10 == 4) {
            millisecondName = " миллисекунды ";
        } else if (millisecond % 10 == 1) {
            millisecondName = " миллисекунда ";
        }

        if (minute == 2 || minute == 3 || minute == 4 || minute == 22 || minute == 23 || minute == 24 ||
                minute == 32 || minute == 33 || minute == 34 || minute == 42 || minute == 43 || minute == 44
                || minute == 52 || minute == 53 || minute == 54) {
            minuteName = " минуты ";
        } else if (minute == 1 || minute == 21 || minute == 31 || minute == 41 || minute == 51) {
            minuteName = " минута ";
        } else if (minute >= 5 && minute <= 20 || minute == 0 || minute >= 25 && minute <= 30 ||
                minute >= 35 && minute <= 40 || minute >= 45 && minute <= 50 || minute >= 55 && minute <= 59) {
            minuteName = " минут ";
        }

        if (hour == 2 || hour == 3 || hour == 4 || hour == 22 || hour == 23 || hour == 24) {
            hourName = " часа ";
        } else if (hour == 1 || hour == 21) {
            hourName = " час ";
        } else if (hour >= 5 && hour <= 20 || hour == 0) {
            hourName = " часов ";
        }

        if (!shortFormat) {
            result = hour + hourName + minute + minuteName + second + secondName + millisecond + millisecondName;
        } else {
            if (millisecond < 10) {
                milliseconds = "00" + millisecond;
            } else if (millisecond < 100) {
                milliseconds = "0" + millisecond;
            } else {
                milliseconds = "" + millisecond;
            }

            if (second < 10) {
                seconds = "0" + second;
            } else {
                seconds = "" + second;
            }

            if (minute < 10) {
                minutes = "0" + minute;
            } else {
                minutes = "" + minute;
            }

            if (hour < 10) {
                hours = "0" + hour;
            } else {
                hours = "" + hour;
            }

            result = hours + ":" + minutes + ":" + seconds + "." + milliseconds;
        }

        return result;
    }
}


