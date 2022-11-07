package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation{

    public void printElements(int[] arr) {
        int b = 0;
        System.out.println("Print Elements using Do...while");
        do {
            System.out.print(arr[b] + " ");
            b++;
        } while (b <= arr.length - 1);
        System.out.println("");
    }

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
