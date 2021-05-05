package ua.kharin.lesson3;

public class Task6 {
	public static void main(String[] args) {
		int number = 15354130;
		System.out.println("Четных: " + calcEvenAndOddAmount(number)[0]);
		System.out.println("Нечетных: " + calcEvenAndOddAmount(number)[1]);
	}

	private static int[] calcEvenAndOddAmount(int number) {
		int even = 0;
		int odd = 0;
		while (number > 0) {
			if (number % 2 == 0 && number % 10 != 0) {
				even++;
			}
			if (number % 2 == 1) {
				odd++;
			}
			number /= 10;
		}
		int[] array = new int[2];
		array[0] = even;
		array[1] = odd;
		return array;
	}

}
