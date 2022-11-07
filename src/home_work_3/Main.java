package home_work_3;

import static home_work_3.Task3.toWeek;
import static home_work_3.Task4.toHoursMinuteSecondMillisecond;

public class Main {
    public static void main(String[] args) {
        long millisecond = 7403852;
        int days = 5;
        System.out.println(toHoursMinuteSecondMillisecond(millisecond, true));
        System.out.println(toWeek(days));
    }
}
