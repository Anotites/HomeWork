package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    public void printElements(int[] arr) {
        System.out.println("Print Elements using For each");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

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
