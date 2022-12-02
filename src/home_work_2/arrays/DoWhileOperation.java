package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: do....while).
     */
    public String printElements(int[] arr) {
        String result = "";
        int b = 0;
        result = result + "Print Elements using Do...while" + "\n";
        do {
            result = result + arr[b] + " ";
            b++;
        } while (b <= arr.length - 1);
        result = result + "\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: do....while).
     */
    public String printEvery2thElement(int[] arr) {
        String result = "";
        int b = 0;
        result = result + "Print Every 2th Element using Do...while" + "\n";
        do {
            b++;
            result = result + arr[b] + " ";
            b++;
        } while (b < arr.length - 1);
        result = result + "\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: do....while).
     */
    public String printReversedElements(int[] arr) {
        String result = "";
        int b = arr.length - 1;
        result = result + "Print Reversed Elements using Do...while" + "\n";
        do {
            result = result + arr[b] + " ";
            b--;
        } while (b >= 0);
        result = result + "\n";
        return result.trim();
    }
}
