package home_work_2.loops;

public class Task12 {

    public static void main(String[] args) {

        multiplication("123");
    }

    /**
     * Метод, позволяющий все цифры из числа, введенного через аргумент к исполняемой программе,
     * перемножить между собой и вывести ход вычислений в консоль.
     *
     * @param toInsert Число, цифры которого будут перемножаться.
     */
    public static void multiplication(String toInsert) {
        String lowerString = toInsert.toLowerCase();

        if (toInsert.contains(".") || toInsert.contains(",")) {
            System.out.println("Введено не целое число.");
        } else if (lowerString.matches("[a-z]+") || lowerString.matches("[а-я]+")
                || lowerString.matches("ё")) {
            System.out.println("Введено не число.");
        } else {
            String toSplit[] = toInsert.split("");
            int numbers[] = new int[toSplit.length];

            for (int i = 0; i < toInsert.length(); i++) {
                numbers[i] = Integer.parseInt(toSplit[i]);
            }
            int forLoop = 1;
            for (int i = 0; i < numbers.length - 1; i++) {
                forLoop = forLoop * numbers[i];
                System.out.print(numbers[i] + "*");
            }
            System.out.print(numbers[numbers.length - 1] + "=" + forLoop * numbers[numbers.length - 1]);
        }
    }
}
