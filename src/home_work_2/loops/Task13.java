package home_work_2.loops;

public class Task13 {

    /**
     * Метод для возведения числа в степень. Данные вводятся через консоль.
     *
     * @param base  Число, которое будут возводить в степень. Может быть отрицательным.
     * @param power Степень. Не может быть отрицательной в конкретном методе.
     * @return Результат возведения в степень.
     */
    public static String pow(double base, long power) {
        double result = base;
        if (power < 0) {
            return "Степень должна быть положительным числом.";
        } else {
            for (long i = 1; i < power; i++) {
                result = result * base;
            }
            return base + " ^ " + power + " = " + result;
        }
    }
}
