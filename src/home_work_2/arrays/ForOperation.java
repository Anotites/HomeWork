package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: for).
     */
    public void printElements(int[] arr) {
        System.out.println("Print Elements using For");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: for).
     */
    public void printEvery2thElement(int[] arr) {
        System.out.println("Print Every 2th Element using For");
        for (int j = 1; j < arr.length; j = j + 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: for).
     */
    public void printReversedElements(int[] arr) {
        System.out.println("Print Reversed Elements using For");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
}
