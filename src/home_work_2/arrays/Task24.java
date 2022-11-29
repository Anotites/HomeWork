package home_work_2.arrays;

public class Task24 {

    // В условии задачи 2.1.2 было сказано, что рандомные числа будут от 0 до 99. Нам нужно использовать массив из задачи 2.1.2 в
    // задаче 2.4. В задаче 2.4 сказано, что в массиве есть и положительные и отрицательные числа (задача 2.4.1). Я буду использовать массив
    // из задачи 2.1.2, но в методе из задачи 2.4 пропишу условие, чтобы искались положительные числа из массива, чтобы
    // это условие работало на других массивах (где есть и отрицательные числа).

    // Убрала исходное условие, что массив должен быть рандомным
    // (можно просто в параметры потом передавать рандомный массив).

    /**
     * Метод, находящий сумму четных положительных элементов массива.
     *
     * @param initial Массив для программы.
     * @return Сумма четных положительных элементов массива.
     */
    public static int sumOfEvenPositiveNumbers(int[] initial) {
        int positive = 0;

        for (int value : initial) {
            if (value > 0) {
                positive++;
            }
        }

        int[] positiveArr = new int[positive];
        int positiveIndex = 0;

        for (int i : initial) {
            if (i > 0) {
                positiveArr[positiveIndex] = i;
                positiveIndex++;
            }
        }

        int even = 0;

        for (int j : positiveArr) {
            if (j % 2 == 0) {
                even++;
            }
        }

        int[] evenArr = new int[even];
        int evenNumber = 0;
        int result = 0;

        for (int i : positiveArr) {
            if (i % 2 == 0) {
                evenArr[evenNumber] = i;
                result = result + evenArr[evenNumber];
                evenNumber++;
            }
        }
        return result;
    }

    /**
     * Метод, находящий максимальный элемент из элементов массива с четными индексами.
     *
     * @param initial Массив для программы.
     * @return Максимальный из элементов массива с четными индексами.
     */
    public static int maxNumberWithEvenIndex(int[] initial) {
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

        for (int j : evenArr) {
            if (maxNumber < j) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }

    /**
     * Метод, выводящий элементы массива, которые меньше среднего арифметического элементов массива.
     *
     * @param initial Массив для программы.
     * @return Элементы массива, которые меньше среднего арифметического.
     */
    public static int[] elementsLessThanAverage(int[] initial) {
        double average;
        double sum = 0d;

        for (int i : initial) {
            sum = sum + i;
        }

        average = sum / initial.length;
        int numberForNewArr = 0;

        for (int i : initial) {
            if (i < average) {
                numberForNewArr++;
            }
        }

        int[] lessThanAverageArr = new int[numberForNewArr];
        int lessThanAverageIndex = 0;

        for (int i : initial) {
            if (i < average) {
                lessThanAverageArr[lessThanAverageIndex] = i;
                lessThanAverageIndex++;
            }
        }
        return lessThanAverageArr;
    }

    /**
     * Метод, определяющий два наименьших (минимальных) элемента массива.
     *
     * @param initial Массив для программы.
     * @return 2 наименьших элемента массива.
     */
    public static String twoMinElements(int[] initial) {
        int theMostMinimal = initial[0];

        for (int k : initial) {
            if (theMostMinimal > k) {
                theMostMinimal = k;
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
            for (int k : initial) {
                if (k == theMostMinimal) {
                } else {
                    arrWithoutMin[count] = k;
                    count++;
                }
            }

            theMinimal = arrWithoutMin[0];
            for (int j : arrWithoutMin) {
                if (theMinimal > j) {
                    theMinimal = j;
                }
            }
        }
        return "Два минимальных числа из массива равны " + theMostMinimal + " и " + theMinimal + ".";
    }

    /**
     * Метод, возвращающий сжатый массив без элементов, принадлежащих заданному интервалу.
     *
     * @param start   Начальное значение интервала. Значения конечного массива должны не входить в интервал.
     * @param end     Конечное значение интервала. Значения конечного массива должны не входить в интервал.
     * @param initial Массив для программы.
     * @return Сжатый массив без элементов, принадлежащих заданному интервалу. Освободившиеся места в массиве
     * заполнены нулями.
     */
    public static int[] lessArr(int start, int end, int[] initial) {

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
     * @param initial Массив для программы.
     * @return Сумма всех цифр массива.
     */
    public static int sumOfNumbers(int[] initial) {
        int sum = 0;

        String arr = "";
        for (int j : initial) {
            arr = arr + j;
        }

        String[] toSplit = arr.split("");
        int[] sumArr = new int[toSplit.length];

        for (int i = 0; i < toSplit.length; i++) {
            sumArr[i] = Integer.parseInt(toSplit[i]);
            sum = sum + sumArr[i];
        }

        return sum;
    }
}


