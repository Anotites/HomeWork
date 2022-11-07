package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    public void printElements(int[] arr) {
        System.out.println("Print Elements using For");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }

    public void printEvery2thElement(int[] arr) {
        System.out.println("Print Every 2th Element using For");
        for (int j = 1; j < arr.length; j = j + 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }

    public void printReversedElements(int[] arr) {
        System.out.println("Print Reversed Elements using For");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
}
