package additional.strings;

public class Task4 {
    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        long sec = millisecond / 1000;
        millisecond = millisecond % 1000;
        long second = sec % 60;
        long min = sec / 60;
        long minute = min % 60;
        long hour = min / 60;

        String result = null;
        String milliseconds = null;
        String seconds = null;
        String minutes = null;
        String hours = null;
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

        if (shortFormat == false) {
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
