package home_work_2.loops;

import static java.lang.Math.abs;

public class Task14 {
    public static void main(String[] args) {
        long a = 1;
        long b = -3; // вместо 3 можно ввести любое целочисленное число (в том числе из условия: 188, -19).
        long c;
        long d = 0;

        if (b > 0) {
            while (a > d) {
                d = a;
                c = a * b;
                a = c;
            }
            System.out.println("число после переполнения " + a);
            System.out.println("число до переполнения " + d);
        } else {
            a = -1;
            b = abs(b);
            while (a < d) {
                d = a;
                c = a * b;
                a = c;

            }
            System.out.println("число после переполнения " + a);
            System.out.println("число до переполнения " + d);
        }
    }
}
