package ua.kharin.lesson3;

public class Test {
	public static void main(String[] args) {
		for (int i = 6; i >= 0; i -= 2) {
			System.out.println(i);
		}

		String message = "Message";
		System.out.println(message.substring(0, 4));
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i));
		}

		String anotherMessage = new String("Message");
		System.out.println(anotherMessage == message);
		System.out.println(anotherMessage.equals(message));

		StringBuilder numbers = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			numbers.append(i);
		}
		System.out.println(numbers.reverse());
	}
}

