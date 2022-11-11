package additional.strings;

import static additional.strings.Strings.toHoursMinuteSecondMillisecond;
import static additional.strings.Strings.toWeek;

public class Main {
    public static void main(String[] args) {
        long millisecond = 7789001;

        int days = 177;

        int number1 = 223;

        double doubleNumber = 223.1599999;

        System.out.println(Strings.toString1(number1));
        System.out.println(Strings.toString2(doubleNumber));
        System.out.println(toWeek(days));
        System.out.println(toHoursMinuteSecondMillisecond(millisecond, false));
    }
}
