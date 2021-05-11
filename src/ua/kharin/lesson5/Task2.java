package ua.kharin.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		int[] numbers = new int[15];
		fillArrayDesc(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("Contains duplicates: " + containsDuplicates(numbers));
	}

	private static void fillArrayDesc(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(100);
		}
	}

	private static boolean containsDuplicates(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
