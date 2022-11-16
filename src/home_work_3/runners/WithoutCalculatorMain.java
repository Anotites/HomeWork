package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double value1 = 4.1;
        double value2 = 15;
        double value3 = 7;
        double value4 = 28;
        double value5 = 5;
        double value6 = 2;

        double finalValue1 = value1 + value2 * value3 + Math.pow((value4 / value5), value6);
        System.out.printf("%.2f%n", finalValue1); // 140.46

        // Усложнения выше, чтобы сделать результат (28 / 5) ^ 2 double значением.
        // Можно было просто так сделать (добавить дробную часть).
        double finalValue2 = 4.1 + 15.0 * 7.0 + (28.0 / 5.0) * (28.0 / 5.0);
        System.out.printf("%.2f%n", finalValue2); // 140.46
    }
}
