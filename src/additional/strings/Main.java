package additional.strings;

import static additional.strings.Task1.toString1;
import static additional.strings.Task3.toWeek;
import static additional.strings.Task4.toHoursMinuteSecondMillisecond;

public class Main {
    public static void main(String[] args) {
        long millisecond = 7403852;
        int days = 5;
        int number = 110110110;
        System.out.println(toHoursMinuteSecondMillisecond(millisecond, true));
        System.out.println(toWeek(days));
        System.out.println(toString1(number));
    }
}
