package newfeatures;
public class RecordExample {
	public static void main(String[] args) {
		// Creating an instance of the Person record
		Person person = new Person("John", 30);

		// Accessing fields of the record
		System.out.println("Name: " + person.name());
		System.out.println("Age: " + person.age());

		// Printing the record instance
		System.out.println("Person record: " + person);
	}

	// Defining a record named Person with two components: name and age
	record Person(String name, int age) {
	}
}
