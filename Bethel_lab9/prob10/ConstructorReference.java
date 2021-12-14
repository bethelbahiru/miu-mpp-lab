package prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import prob7b.TriFunction;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only Female canditates names
		System.out.println("************* Only Female Candidate Names***********");
		Stream.of(list).filter(x -> x.getGender().equals("Female")).forEach(x -> System.out.println(x.getName()));

		// Query 2 : Cretae an objecy by choosing suitable Interface to the specified
		// constructors(Totally 3 constuctors)using fouth type of Method Reference
		// ClassName::new. Then print the object status
		System.out.println("************* Human Object Construction Using Method Reference***********");
		TriFunction<String, Integer, String, Human> bf = Human::new;
		System.out.println(bf.apply("Bethel",24, "Female"));

		// Query 3 : Count the male candidates whose age is more than 30
		System.out.println("************* Count of Only Male Whose age is more than 30***********");

		long ct = Stream.of(list).filter(x -> x.getGender().equals("Male")).filter(x -> x.getAge() > 30).count();
		System.out.println(ct);

	}

}
