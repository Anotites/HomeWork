package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class MainFor23 {
    public static void main(String[] args) {
        int[] arr1 = arrayFromConsole();

        ForEachOperation example1 = new ForEachOperation();
        ForOperation example2 = new ForOperation();
        WhileOperation example3 = new WhileOperation();
        DoWhileOperation example4 = new DoWhileOperation();

        System.out.println(example1.printElements(arr1));
        System.out.println(example1.printEvery2thElement(arr1));
        System.out.println(example1.printReversedElements(arr1));

        System.out.println(example2.printElements(arr1));
        System.out.println(example2.printEvery2thElement(arr1));
        System.out.println(example2.printReversedElements(arr1));

        System.out.println(example3.printElements(arr1));
        System.out.println(example3.printEvery2thElement(arr1));
        System.out.println(example3.printReversedElements(arr1));

        System.out.println(example4.printElements(arr1));
        System.out.println(example4.printEvery2thElement(arr1));
        System.out.println(example4.printReversedElements(arr1));
    }
}