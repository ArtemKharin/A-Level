package ua.kharin.lesson7.inheritance;

public class Task2 {
	public static void main(String[] args) {
		Person[] humans = new Person[3];
		humans[0] = new Person(18, "Andrew");
		humans[1] = new Employee(20,"Max", 1000);
		humans[2] = new Teacher(35, "Stewe", 1500, "Math");
		for (Person person: humans){
			person.describeYourself();
		}
	}
}
