package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: foreach).
     */
    public void printElements(int[] arr) {
        System.out.println("Print Elements using For each");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: foreach).
     */
    public void printEvery2thElement(int[] arr) {
        System.out.println("Print Every 2th Element using For each");
        int a = 0;
        for (int element : arr) {
            a++;
            if (a % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println("");
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: foreach).
     */
    public void printReversedElements(int[] arr) {
        System.out.println("Print Reversed Elements using For each");
        int[] reversedArr = new int[arr.length];
        int k = arr.length;

        for (int element : arr) {
            k--;
            reversedArr[k] = element;
        }
        for (int element : reversedArr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
