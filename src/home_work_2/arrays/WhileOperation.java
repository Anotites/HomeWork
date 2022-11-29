package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    /**
     * Метод, позволяющий вывести в консоль все числа, введенные через консоль как элементы массива.
     * Элементы будут выведены 1 раз (при помощи цикла: while).
     */
    public String printElements(int[] arr) {
        String result="";
        int i = 0;
        result = result+"Print Elements using While"+"\n";
        while (i <= arr.length - 1) {
            result=result+arr[i] + " ";
            i++;
        }
        result = result+"\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль каждый второй элемент массива,
     * элементы которого будут введены через консоль.
     * Каждый второй элемент будет выведен 1 раз (при помощи цикла: while).
     */
    public String printEvery2thElement(int[] arr) {
        String result="";
        int i = 0;
        result = result+"Print Every 2th Element using While"+"\n";
        while (i < arr.length - 1) {
            i++;
            result=result+arr[i] + " ";
            i++;
        }
        result = result+"\n";
        return result.trim();
    }

    /**
     * Метод, позволяющий вывести в консоль элементы массива в обратном порядке.
     * Изначально элементы массива будут введены через консоль.
     * Элементы в обратном порядке будут выведены 1 раз (при помощи цикла: while).
     */
    public String printReversedElements(int[] arr) {
        String result="";
        int i = arr.length - 1;
        result = result+"Print Reversed Elements using While"+"\n";
        while (i >= 0) {
            result=result+arr[i] + " ";
            i--;
        }
        result = result+"\n";
        return result.trim();
    }
}
