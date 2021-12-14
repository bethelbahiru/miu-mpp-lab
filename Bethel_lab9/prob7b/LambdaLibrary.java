package prob7b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, List<String>, String> FILTER_EMPLOYEE = (emps, salary, letters) -> 
			emps.stream().filter(x -> x.getSalary() > salary).filter(x -> letters.contains(String.valueOf(x.getLastName().charAt(0))))
			.sorted(Comparator.comparing((Employee x) -> x.getFirstName())).map(x->x.getFirstName() +" "+ x.lastName)
			.collect(Collectors.joining(","));

}
