package home_work_2.arrays;

import static home_work_2.arrays.Task24.*;

public class MainFor24 {
    public static void main(String[] args) {

        int container3 = sumOfEvenPositiveNumbers();
        System.out.print("Sum Of Even Positive Numbers is " + container3);
        System.out.println("");

        int container4 = maxNumberWithEvenIndex();
        System.out.print("Max Number With Even Index is " + container4);
        System.out.println("");

        int[] container5 = elementsLessThanAverage();
        System.out.print("Elements Less Than Average are ");
        printArray(container5);
        System.out.println("");

        twoMinElements();
        System.out.println("");

        int[] container6 = lessArr(10, 90);
        System.out.print("Elements not from interval are ");
        printArray(container6);
        System.out.println("");

        int container7 = sumOfNumbers();
        System.out.print("Sum of Numbers is " + container7);
        System.out.println("");
    }

    /**
     * Метод, который выводит все элементы массива в консоль.
     *
     * @param arr Массив для вывода в консоль.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
