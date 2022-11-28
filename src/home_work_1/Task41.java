package home_work_1;

public class Task41 {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 2147483647 / 2);
        number1 = number1 * 2;
        System.out.println(number1 + " - первое число.");
        // Так как в условии было сказано "из двух случайных чисел, одно из которых четное, а второе нечетное",
        // инициализация чисел выглядит так странно (так как мне нужно было точно знать, что 1 рандомное число
        // будет четным, а второе нечетным. Без этого условия я могла просто вводить числа из консоли
        // или взять 2 рандомных числа и их уже проверять на четность/нечетность).
        int number2 = (int) (Math.random() * 2147483647 / 2);
        number2 = number2 * 2 - 1;
        System.out.println(number2 + " - второе число.");
        System.out.println(oddCheck(number1, number2));
    }

    /**
     * Метод, который из двух случайных чисел, позволяет определить нечётное число. Одно из чисел четное,
     * а второе нечетное.
     *
     * @param number1 Первое число.
     * @param number2 Второе число.
     * @return Определение, какое число нечетное.
     */
    public static String oddCheck(int number1, int number2) {
        String result = "";
        if (number1 % 2 == 1) {
            result = number1 + " - нечетное число.";
        } else if (number2 % 2 == 1) {
            result = number2 + " - нечетное число.";
        }
        return result;
    }
}
