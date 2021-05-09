package ua.kharin.lesson4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 6, -4, 7, 1, 0, 113, 66, 96, 2, 7, 1, 0};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sort(numbers, true)));
        System.out.println(Arrays.toString(sort(numbers, false)));

    }

    private static int[] sort(int[] numbers, boolean ascending) {
        int[] resultArray = Arrays.copyOf(numbers, numbers.length);
        boolean swapped;
        int amountSwapped = 0;
        do {
            swapped = false;
            for (int i = 0; i < resultArray.length - 1 - amountSwapped; i++) {
                if ((ascending && resultArray[i] > resultArray[i + 1])||
                        (!ascending && resultArray[i] < resultArray[i + 1])) {
                    int temp = resultArray[i];
                    resultArray[i] = resultArray[i + 1];
                    resultArray[i + 1] = temp;
                    swapped = true;
                }
            }
            amountSwapped ++;
        } while (swapped);
        return resultArray;
    }
}
