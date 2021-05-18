package ua.kharin.lesson7.inheritance;

public class Employee extends Person {
	protected double salary;

	public Employee(int age, String name, double salary) {
		super(age, name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"salary=" + salary +
				", age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
