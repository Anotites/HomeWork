package additional.strings;

import static additional.strings.Task3.toWeek;
import static additional.strings.Task4.toHoursMinuteSecondMillisecond;

public class Main {
    public static void main(String[] args) {
        long millisecond = 7403852;
        int days = 5;
        System.out.println(toHoursMinuteSecondMillisecond(millisecond, true));
        System.out.println(toWeek(days));
    }
}
