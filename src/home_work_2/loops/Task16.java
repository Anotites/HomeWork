package home_work_2.loops;

public class Task16 {
    public static void main(String[] args) {
        int number = 9;
        multiplicationTable(number);
    }

    public static void multiplicationTable(int number) {
        System.out.println("");
        System.out.println("\t\t\t" + "Таблица умножения");
        System.out.println("");
        if (number <= 5) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 2; j <= number; j++) {
                    if (j == number) {
                        System.out.print(j + " * " + i + " = " + i * j + "\t");
                        System.out.println("");
                    } else {
                        System.out.print(j + " * " + i + " = " + i * j + "\t");
                    }
                }
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                for (int j = 2; j <= 5; j++) {
                    if (j == 5) {
                        System.out.print(j + " * " + i + " = " + i * j + "\t");
                        System.out.println("");
                    } else {
                        System.out.print(j + " * " + i + " = " + i * j + "\t");
                    }
                }
            }
            System.out.println("");
            for (int i = 1; i <= 10; i++) {
                for (int j = 6; j <= number; j++) {
                    if (j == number) {
                        System.out.print(j + " * " + i + " = " + i * j + "\t");
                        System.out.println("");
                    } else {
                        System.out.print(j + " * " + i + " = " + i * j + "\t");
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("ЭТО");
        System.out.println("НУЖНО");
        System.out.println("ЗНАТЬ!");
    }
}


