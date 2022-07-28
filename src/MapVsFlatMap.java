import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
	String name;
	List<String> phoneNumbers;
	public Person(String name, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
}

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Person> persons = Stream.of(
				new Person("Abhinav",Arrays.asList("9795930632","7338710323")),
				new Person("Alok",Arrays.asList("9453122672","9415476241"))).collect(Collectors.toList());
		
		System.out.println(persons);
		
		List<List<String>> phoneNumbersMap = persons.stream().map(person->person.phoneNumbers).collect(Collectors.toList());
		System.out.println(phoneNumbersMap);
		List<String> phoneNumbersFlatMap = persons.stream().flatMap(person->person.phoneNumbers.stream()).collect(Collectors.toList());
		System.out.println(phoneNumbersFlatMap);
	}
}
