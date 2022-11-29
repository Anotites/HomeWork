package home_work_2.loops;

public class Task11 {

    /**
     * Метод, позволяющий перемножить числа от 1 до числа (включительно), введенного через
     * аргумент к исполняемой программе. Используемый цикл - for.
     *
     * @param number Число, до которого будет производиться перемножение.
     * @return Произведение чисел от 1 до числа (включительно), введенного через аргумент
     * к исполняемой программе.
     */
    public static String loop(String number) {
        String resultString = "";
        long numberLoop = Long.parseLong(number);
        long result = 1;
        boolean comma = false;
        if (numberLoop <= 0) {
            resultString = "Введите положительное число как аргумент.";
        } else if (numberLoop >= 21) {
            resultString = "Введите число меньше 21 (иначе произойдет переполнение).";
        } else {
            for (long i = 1; i <= numberLoop; i++) {
                if (comma) {
                    resultString = resultString + " * ";
                } else {
                    comma = true;
                }
                result = result * i;
                resultString = resultString + i;
            }
            resultString = resultString + " = " + result;
        }
        return resultString;
    }

    /**
     * Метод, позволяющий перемножить числа от 1 до числа (включительно), введенного через
     * аргумент к исполняемой программе. Используемый цикл - рекурсия.
     *
     * @param number Число, до которого будет производиться перемножение.
     * @return Произведение чисел от 1 до числа (включительно), введенного через аргумент
     * к исполняемой программе.
     */
    public static long recursion(String number) {
        long numberRecursion = Long.parseLong(number);
        if (numberRecursion <= 1) {
            return 1;
        } else {
            String numberRecursion1 = Long.toString(numberRecursion - 1);
            long numberRecursion2 = recursion(numberRecursion1);
            return numberRecursion * numberRecursion2;
        }
    }

    /**
     * Метод, позволяющий вывести процесс выражения.
     *
     * @param number Число, до которого будет производиться перемножение.
     * @return Отформатированная запись выражения до результата, например, вводим 3, получаем "1*2*3=".
     */
    public static String format(String number) {
        long numberRecursion = Long.parseLong(number);
        String result = "";
        boolean comma = false;
        for (int i = 1; i <= numberRecursion; i++) {

            if (comma) {
                result += " * ";
            } else {
                comma = true;
            }
            result += i;
        }
        result = result + " = ";
        return result;
    }
}

