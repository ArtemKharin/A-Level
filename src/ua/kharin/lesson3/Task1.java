package ua.kharin.lesson3;

public class Task1 {
	public static void main(String[] args) {
//		у = x – 2, если x > 0,
//		y = 0, если x = 0,
//		y = |x|, если x < 0.
		//читаем данные из консоли
		System.out.println(calcFunction(-5));
	}

	private static int calcFunction(int x) {
		if (x > 0) {
			return x - 2;
		}
		return Math.abs(x);
	}
}
