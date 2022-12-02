package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: foreach).
     */
    public String printElements(int[] arr) {
        String result = "";
        result = result + "Print Elements using For each" + "\n";
        for (int element : arr) {
            result = result + element + " ";
        }
        result = result + "\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: foreach).
     */
    public String printEvery2thElement(int[] arr) {
        String result = "";
        result = result + "Print Every 2th Element using For each" + "\n";
        int a = 0;
        for (int element : arr) {
            a++;
            if (a % 2 == 0) {
                result = result + element + " ";
            }
        }
        result = result + "\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: foreach).
     */
    public String printReversedElements(int[] arr) {
        String result = "";
        result = result + "Print Reversed Elements using For each" + "\n";
        int[] reversedArr = new int[arr.length];
        int k = arr.length;

        for (int element : arr) {
            k--;
            reversedArr[k] = element;
        }
        for (int element : reversedArr) {
            result = result + element + " ";
        }
        result = result + "\n";
        return result.trim();
    }
}
