package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Task24 {

    // В условии задачи 2.1.2 было сказано, что рандомные числа будут от 0 до 99. Нам нужно использовать массив из задачи 2.1.2 в
    // задаче 2.4. В задаче 2.4 сказано, что в массиве есть и положительные и отрицательные числа (задача 2.4.1). Я буду использовать массив
    // из задачи 2.1.2, но в методе из задачи 2.4 пропишу условие, чтобы искались положительные числа из массива, чтобы
    // это условие работало на других массивах (где есть и отрицательные числа).

    /**
     * Метод, находящий сумму четных положительных элементов массива.
     *
     * @return Сумма четных положительных элементов массива. Массив будет сформирован рандомно.
     */
    public static int sumOfEvenPositiveNumbers() {
        int[] initial = arrayRandom(50, 100);
        int positive = 0;

        for (int i = 0; i < initial.length; i++) {
            if (initial[i] > 0) {
                positive++;
            }
        }

        int[] positiveArr = new int[positive];
        int positiveIndex = 0;

        for (int j = 0; j < initial.length; j++) {
            if (initial[j] > 0) {
                positiveArr[positiveIndex] = initial[j];
                positiveIndex++;
            }
        }

        int even = 0;

        for (int k = 0; k < positiveArr.length; k++) {
            if (positiveArr[k] % 2 == 0) {
                even++;
            }
        }

        int[] evenArr = new int[even];
        int evenNumber = 0;
        int result = 0;

        for (int l = 0; l < positiveArr.length; l++) {
            if (positiveArr[l] % 2 == 0) {
                evenArr[evenNumber] = positiveArr[l];
                result = result + evenArr[evenNumber];
                evenNumber++;
            }
        }
        return result;
    }

    /**
     * Метод, находящий максимальный элемент из элементов массива с четными индексами.
     *
     * @return Максимальный из элементов массива с четными индексами. Массив будет сформирован рандомно.
     */
    public static int maxNumberWithEvenIndex() {
        int[] initial = arrayRandom(50, 100);
        int even = 0;

        for (int k = 0; k < initial.length; k++) {
            if (k % 2 == 0) {
                even++;
            }
        }

        int[] evenArr = new int[even];
        int evenIndex = 0;

        for (int l = 0; l < initial.length; l++) {
            if (l % 2 == 0) {
                evenArr[evenIndex] = initial[l];
                evenIndex++;
            }
        }

        int maxNumber = evenArr[0];

        for (int i = 0; i < evenArr.length; i++) {
            if (maxNumber < evenArr[i]) {
                maxNumber = evenArr[i];
            }
        }
        return maxNumber;
    }

    /**
     * Метод, выводящий элементы массива, которые меньше среднего арифметического элементов массива.
     *
     * @return Элементы массива, которые меньше среднего арифметического. Массив будет сформирован рандомно.
     */
    public static int[] elementsLessThanAverage() {
        int[] initial = arrayRandom(50, 100);
        int average;
        int sum = 0;

        for (int k = 0; k < initial.length; k++) {
            sum = sum + initial[k];
        }

        average = sum / initial.length;
        int numberForNewArr = 0;

        for (int l = 0; l < initial.length; l++) {
            if (initial[l] < average) {
                numberForNewArr++;
            }
        }

        int[] lessThanAverageArr = new int[numberForNewArr];
        int lessThanAverageIndex = 0;

        for (int l = 0; l < initial.length; l++) {
            if (initial[l] < average) {
                lessThanAverageArr[lessThanAverageIndex] = initial[l];
                lessThanAverageIndex++;
            }
        }
        return lessThanAverageArr;
    }

    /**
     * Метод, определяющий два наименьших (минимальных) элемента массива. Массив будет сформирован рандомно.
     */
    public static void twoMinElements() {
        int[] initial = arrayRandom(50, 100);

        int theMostMinimal = initial[0];

        for (int i = 0; i < initial.length; i++) {
            if (theMostMinimal > initial[i]) {
                theMostMinimal = initial[i];
            }
        }

        int theMinimal;
        int a = 0;


        for (int element : initial) {
            if (element == theMostMinimal) {
                a++;
            }
        }

        if (a >= 2) {
            theMinimal = theMostMinimal;
        } else {
            int[] arrWithoutMin = new int[initial.length - 1];
            int count = 0;
            for (int j = 0; j < initial.length; j++) {
                if (initial[j] == theMostMinimal) {
                } else {
                    arrWithoutMin[count] = initial[j];
                    count++;
                }
            }

            theMinimal = arrWithoutMin[0];
            for (int i = 0; i < arrWithoutMin.length; i++) {
                if (theMinimal > arrWithoutMin[i]) {
                    theMinimal = arrWithoutMin[i];
                }
            }
        }
        System.out.print("Два минимальных числа из массива равны " + theMostMinimal + " и " + theMinimal + ".");
    }

    /**
     * Метод, возвращающий сжатый массив без элементов, принадлежащих заданному интервалу.
     *
     * @param start Начальное значение интервала. Значения конечного массива должны не входить в интервал.
     * @param end   Конечное значение интервала. Значения конечного массива должны не входить в интервал.
     * @return Сжатый массив без элементов, принадлежащих заданному интервалу. Освободившиеся места в массиве
     * заполнены нулями. Исходный массив формировался рандомно.
     */
    public static int[] lessArr(int start, int end) {
        int[] initial = arrayRandom(50, 100);

//        метод, чтобы убрать индексы в промежутке (сделано факультативно, для интереса).
//        for (int i = 0; i < initial.length; i++) {
//            if (i >= start) {
//                if(i + (end - start + 1)>initial.length-1) {
//                    initial[i] = 0;
//                } else {
//                    initial[i]=initial[i + (end - start + 1)];
//                }
//            }
//        }
//        return initial;

        int count = 0;

        for (int i = 0; i < initial.length; i++) {
            if (initial[i] >= start && initial[i] <= end) {
                count++;
            } else {
                initial[i - count] = initial[i];
            }
        }
        for (int i = initial.length - count; i < initial.length; i++) {
            initial[i] = 0;
        }

        return initial;
    }

    /**
     * Массив, возвращающий сумм цифр массива.
     *
     * @return Сумма всех цифр массива. Исходный массив формировался рандомно.
     */
    public static int sumOfNumbers() {
        int[] initial = arrayRandom(50, 100);
        int sum = 0;

        String arr = "";
        for (int i = 0; i < initial.length; i++) {
            arr = arr + initial[i];
        }

        String toSplit[] = arr.split("");
        int sumArr[] = new int[toSplit.length];

        for (int i = 0; i < toSplit.length; i++) {
            sumArr[i] = Integer.parseInt(toSplit[i]);
            sum = sum + sumArr[i];
        }

        return sum;
    }
}


