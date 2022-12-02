package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: for).
     */
    public String printElements(int[] arr) {
        String result = "";
        result = result + "Print Elements using For" + "\n";
        for (int j = 0; j < arr.length; j++) {
            result = result + arr[j] + " ";
        }
        result = result + "\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: for).
     */
    public String printEvery2thElement(int[] arr) {
        String result = "";
        result = result + "Print Every 2th Element using For" + "\n";
        for (int j = 1; j < arr.length; j = j + 2) {
            result = result + arr[j] + " ";
        }
        result = result + "\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: for).
     */
    public String printReversedElements(int[] arr) {
        String result = "";
        result = result + "Print Reversed Elements using For" + "\n";
        for (int j = arr.length - 1; j >= 0; j--) {
            result = result + arr[j] + " ";
        }
        result = result + "\n";
        return result.trim();
    }
}
