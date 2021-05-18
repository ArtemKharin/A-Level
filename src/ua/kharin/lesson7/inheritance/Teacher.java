package ua.kharin.lesson7.inheritance;

public class Teacher extends Employee{
	protected String subject;

	public Teacher(int age, String name, double salary, String subject) {
		super(age, name, salary);
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"subject='" + subject + '\'' +
				", salary=" + salary +
				", age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
