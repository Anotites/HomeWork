package home_work_2.loops;

public class Task16 {

    /**
     * Метод, строящий таблицу умножения до определенного числа.
     *
     * @param number До какого числа необходимо построить таблицу умножения на 10?
     * @return Таблица умножения.
     */
    public static String multiplicationTable(int number) {
        String result;
        result = "\n";
        result = result + "\t\t\t" + "Таблица умножения";
        result = result + "\n";
        result = result + "\n";
        if (number <= 5) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 2; j <= number; j++) {
                    if (j == number) {
                        result = result + j + " * " + i + " = " + i * j + "\t";
                        result = result + "\n";
                    } else {
                        result = result + j + " * " + i + " = " + i * j + "\t";
                    }
                }
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                for (int j = 2; j <= 5; j++) {
                    if (j == 5) {
                        result = result + j + " * " + i + " = " + i * j + "\t";
                        result = result + "\n";
                    } else {
                        result = result + j + " * " + i + " = " + i * j + "\t";
                    }
                }
            }
            result = result + "\n";
            for (int i = 1; i <= 10; i++) {
                for (int j = 6; j <= number; j++) {
                    if (j == number) {
                        result = result + j + " * " + i + " = " + i * j + "\t";
                        result = result + "\n";
                    } else {
                        result = result + j + " * " + i + " = " + i * j + "\t";
                    }
                }
            }
        }
        result = result + "\n";
        result = result + "ЭТО";
        result = result + "\n";
        result = result + "НУЖНО";
        result = result + "\n";
        result = result + "ЗНАТЬ";

        return result;
    }
}


