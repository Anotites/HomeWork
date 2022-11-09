package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: do....while).
     */
    public void printElements(int[] arr) {
        int b = 0;
        System.out.println("Print Elements using Do...while");
        do {
            System.out.print(arr[b] + " ");
            b++;
        } while (b <= arr.length - 1);
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: do....while).
     */
    public void printEvery2thElement(int[] arr) {
        int b = 0;
        System.out.println("Print Every 2th Element using Do...while");
        do {
            b++;
            System.out.print(arr[b] + " ");
            b++;
        } while (b < arr.length - 1);
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: do....while).
     */
    public void printReversedElements(int[] arr) {
        int b = arr.length - 1;
        System.out.println("Print Reversed Elements using Do...while");
        do {
            System.out.print(arr[b] + " ");
            b--;
        } while (b >= 0);
        System.out.println("");
    }
}
