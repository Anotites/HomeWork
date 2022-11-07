package home_work_3;

import static home_work_3.Task4.toHoursMinuteSecondMillisecond;

public class Main {
    public static void main(String[] args) {
        long millisecond = 7403852;
        System.out.println(toHoursMinuteSecondMillisecond(millisecond, true));
    }
}
