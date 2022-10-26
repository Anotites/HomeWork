package home_work_1;

public class Task50 {
    public static void main(String[] args) {
        boolean message = sleepIn(true, true);
        // Делаю проверку, если message содержит значение true, вывожу сообщение "Можем спать дальше",
        // иначе "Пора идти на работу".
        if (message) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // Ввожу переменную, которая будет менять значение на true, если день является
        // отпускным или день не является рабочим.
        boolean result = false;
        if (vacation) {
            result = true;
        } else if (!weekday) {
            result = true;
        }
        return result;
    }
}
