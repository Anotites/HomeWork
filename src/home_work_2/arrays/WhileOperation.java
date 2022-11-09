package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: while).
     */
    public void printElements(int[] arr) {
        int i = 0;
        System.out.println("Print Elements using While");
        while (i <= arr.length - 1) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: while).
     */
    public void printEvery2thElement(int[] arr) {
        int i = 0;
        System.out.println("Print Every 2th Element using While");
        while (i < arr.length - 1) {
            i++;
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: while).
     */
    public void printReversedElements(int[] arr) {
        int i = arr.length - 1;
        System.out.println("Print Reversed Elements using While");
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println("");
    }
}
