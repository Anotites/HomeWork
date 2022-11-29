package home_work_2.loops;

public class Task12 {

    /**
     * Метод, позволяющий все цифры из числа, введенного через аргумент к исполняемой программе,
     * перемножить между собой и вывести ход вычислений в консоль.
     *
     * @param toInsert Число, цифры которого будут перемножаться.
     * @return Ход вычислений и результат.
     */
    public static String multiplication(String toInsert) {
        String lowerString = toInsert.toLowerCase();
        String result = "";

        if (toInsert.contains(".") || toInsert.contains(",")) {
            result = "Введено не целое число.";
        } else if (lowerString.matches("[a-z]+") || lowerString.matches("[а-я]+")
                || lowerString.matches("ё")) {
            result = "Введено не число.";
        } else {
            String[] toSplit = toInsert.split("");
            int[] numbers = new int[toSplit.length];

            for (int i = 0; i < toInsert.length(); i++) {
                numbers[i] = Integer.parseInt(toSplit[i]);
            }
            int forLoop = 1;
            for (int i = 0; i < numbers.length - 1; i++) {
                forLoop = forLoop * numbers[i];
                result = result + numbers[i] + " * ";
            }
            result = result + numbers[numbers.length - 1] + " = " + forLoop * numbers[numbers.length - 1];
        }
        return result;
    }
}
