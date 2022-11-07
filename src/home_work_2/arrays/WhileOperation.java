package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    public void printElements(int[] arr) {
        int i = 0;
        System.out.println("Print Elements using While");
        while (i <= arr.length - 1) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("");
    }

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
