package home_work_2.arrays;

import static home_work_2.arrays.Task24.*;

public class MainFor24 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int container3 = sumOfEvenPositiveNumbers(array);
        System.out.print("Sum Of Even Positive Numbers is " + container3);
        System.out.println("");

        int container4 = maxNumberWithEvenIndex(array);
        System.out.print("Max Number With Even Index is " + container4);
        System.out.println("");

        int[] container5 = elementsLessThanAverage(array);
        System.out.print("Elements Less Than Average are ");
        System.out.print(printArray(container5));
        System.out.println("");

        System.out.println(twoMinElements(array));

        int container7 = sumOfNumbers(array);
        System.out.print("Sum of Numbers is " + container7);
        System.out.println("");

        int[] container6 = lessArr(2, 5,array);
        System.out.print("Elements not from interval are ");
        System.out.print(printArray(container6));
        System.out.println("");
    }

    /**
     * Метод, который выводит все элементы массива в консоль.
     *
     * @param arr Массив для вывода в консоль.
     * @return Массив.
     */
    public static String printArray(int[] arr) {
        String result="";
        for (int j : arr) {
            result = result + j + " ";
        }
        return result.trim();
    }
}
