package home_work_6.book;

public class Scanner {
    /**
     * Метод выводит значение, которое пользователь ввел в консоль.
     *
     * @return значение, которое пользователь ввел в консоль.
     */
    public static String scanner() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите ваш выбор:");
        return scanner.next();
    }
}
