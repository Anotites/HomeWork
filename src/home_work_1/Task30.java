package home_work_1;

public class Task30 {
    public static void main(String[] args) {

        // Как пример изучения класса Math найдем значения возведения в степень от 0 до 5 рандомных 5 чисел
        // (выборка от 0 до 100) (каждое рандомное число возводится только 1 раз в какую-то степень от 1 до 5).
        // Также извлечем квадратные корни из 5 рандомных чисел (выборка от 0 до 100). Также (где возможно)
        // использовала методы из этого класса в домашней работе.

        int quantity = 5;
        for (int i = 0; i <= quantity; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println(number + " в степени " + i + " равняется " + (int) Math.pow(number, i));
        }

        System.out.println();

        for (int i = 0; i <= quantity; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println("Квадратный корень из " + number + " равняется " + Math.sqrt(number));
        }
    }
}
