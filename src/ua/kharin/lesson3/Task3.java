package ua.kharin.lesson3;

public class Task3 {
	public static void main(String[] args) {
		String text = "Определить, как часто встречается ";
		char symbol = 'о';
		System.out.println(countChar(text, symbol));
	}

	private static int countChar(String text, char symbol) {
		int count = 0;
		String lowerCaseText = text.toLowerCase();
		System.out.println(text);
		System.out.println(lowerCaseText);
		for (int i = 0; i < lowerCaseText.length(); i++) {
			if (lowerCaseText.charAt(i) == symbol) {
				count++;
			}
		}
		return count;
	}
}
