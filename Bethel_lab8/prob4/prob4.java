package prob4;

import java.util.Arrays;
import java.util.List;

public class prob4 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		System.out.println("********Printed Using Lambda**********");
		fruits.forEach(x -> System.out.println(x));

		System.out.println("********Printed Using Method Reference**********");
		fruits.forEach(System.out::println);

	}

}
