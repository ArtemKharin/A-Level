package ua.kharin.lesson5;

import java.util.Arrays;

/*Задачи:
-минимальное значение
-максимальное значение
-среднее значение
-значение элемента из середины массива*/
public class Task1 {
	public static void main(String[] args) {
		int[] numbers = new int[15];
		fillArrayDesc(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("Min value on index: " + findMinValueIndex(numbers));
		System.out.println("Max value on index: " + findMaxValueIndex(numbers));
		System.out.println("Avg value on index: " + findAvgValueIndex(numbers));
		System.out.println("Value from center of array: " + findCentralElement(numbers));
	}

	private static int findCentralElement(int[] numbers) {
		return numbers[numbers.length / 2];
	}

	private static int findAvgValueIndex(int[] numbers) {
		int[] local = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(local);
		int avgValue = local[(numbers.length / 2)];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == avgValue) {
				return i;
			}
		}
		return -1;
	}

	private static int findMinValueIndex(int[] numbers) {
		int index = 0;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (minValue > numbers[i]) {
				index = i;
				minValue = numbers[i];
			}
		}
		return index;
	}

	private static int findMaxValueIndex(int[] numbers) {
		int index = 0;
		int maxValue = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (maxValue < numbers[i]) {
				index = i;
				maxValue = numbers[i];
			}
		}
		return index;
	}

	private static void fillArrayAsc(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
	}

	private static void fillArrayDesc(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length - i;
		}
	}
}
