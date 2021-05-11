package ua.kharin.lesson5;

import java.util.Arrays;

//переместить последний элемент на 1 место, остальные сдвинуть
public class Task3 {
	public static void main(String[] args) {
		int[] numbers = new int[15];
		fillArrayDesc(numbers);
		System.out.println(Arrays.toString(numbers));
		rearrangeArray(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void fillArrayDesc(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length - i;
		}
	}

	private static void rearrangeArray(int[] numbers) {
		int last = numbers[numbers.length - 1];
		for (int i = numbers.length - 2; i >= 0; i--) {
			numbers[i + 1] = numbers[i];
		}
		numbers[0] = last;
	}
}
