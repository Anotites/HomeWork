package home_work_1;

public class Task50 {
    public static void main(String[] args) {
        System.out.println(sleepInResult(true, false));
    }

    /**
     * Метод, который будет определять дальнейшие действия в зависимости от дня.
     *
     * @param weekday  Рабочий день. Если да, то true.
     * @param vacation Отпуск. Если да, то true.
     * @return Ответ, что делать дальше.
     */
    public static String sleepInResult(boolean weekday, boolean vacation) {
        String finalString;
        boolean message = sleepIn(weekday, vacation);
        if (message) {
            finalString = "Можем спать дальше";
        } else {
            finalString = "Пора идти на работу";
        }
        return finalString;
    }

    /**
     * Метод, который будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
     *
     * @param weekday  Рабочий день. Если да, то true.
     * @param vacation Отпуск. Если да, то true.
     * @return Ответ на вопрос, спать ли дальше (да\нет) (true либо false).
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if (vacation) {
            result = true;
        } else if (!weekday) {
            result = true;
        }
        return result;
    }
}
