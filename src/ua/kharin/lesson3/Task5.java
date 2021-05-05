package ua.kharin.lesson3;

public class Task5 {
	public static void main(String[] args) {
		int number = 10;
		int power = 5;
		System.out.println(power(number, power));
		System.out.println((long)Math.pow(number, power));
	}

	private static long power(int number, int power) {
		long result = 1;
		for (int i = 0; i < power; i++) {
			result *= number;
		}
		return result;
	}
}
