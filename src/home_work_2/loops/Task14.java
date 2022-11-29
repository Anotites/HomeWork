package home_work_2.loops;

import static java.lang.Math.abs;

public class Task14 {

    /**
     * Метод, который позволяет умножать число long a = 1, пока не произойдёт переполнение.
     *
     * @param b Число, которое будут умножать.
     * @return Сообщение со значением до переполнения и после переполнения.
     */
    public static String checkStackOverflow(long b) {
        long a = 1;
        long c;
        long d = 0;

        if (b > 0) {
            while (a > d) {
                d = a;
                c = a * b;
                a = c;
            }
        } else {
            a = -1;
            b = abs(b);
            while (a < d) {
                d = a;
                c = a * b;
                a = c;
            }
        }
        return "Число после переполнения " + a + "; число до переполнения " + d + ".";
    }
}
