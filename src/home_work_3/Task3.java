package home_work_3;

public class Task3 {
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

        String result = day + dayName;
        return result;
    }
}
