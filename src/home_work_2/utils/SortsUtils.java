package home_work_2.utils;

public class SortsUtils {
    /**
     * Метод, сортирующий пузырьковым способом массив чисел (от меньшего к большему).
     *
     * @param arr Массив для сортировки.
     */
    public static void sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temporaryNumber = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temporaryNumber;
                }
            }
        }
    }

    /**
     * Метод, сортирующий шейкерным способом массив чисел (от меньшего к большему).
     *
     * @param arr Массив для сортировки.
     */
    public static void shake(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int count = 1;
        while ((left < right) && count > 0) {
            count = 0;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count = 1;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    count = 1;
                }
            }
            left++;
        }
    }
}
