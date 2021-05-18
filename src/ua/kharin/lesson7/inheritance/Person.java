package ua.kharin.lesson7.inheritance;

public class Person {
	protected int age;
	protected String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void describeYourself() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
