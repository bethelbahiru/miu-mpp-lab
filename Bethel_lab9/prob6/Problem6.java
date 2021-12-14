package prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem6 {

	public static void main(String[] args) {
		List<Set<String>> sb = new ArrayList<>();
		sb.add(Set.of("A", "B"));
		sb.add(Set.of("D"));
		sb.add(Set.of("1", "3", "5"));
			
		System.out.println("Using Reduce: " + unionReduce(sb).toString());
		
		System.out.println("Using FlatMap: " + unionFlatMap(sb).toString());
		

	}
	
	public static Set<String> unionReduce(List<Set<String>> sets) {
		Set<String> sb = new HashSet<>();
		return sets.stream().reduce(sb, (x,y) -> {x.addAll(y); return x;});
	}
	
	public static Set<String> unionFlatMap(List<Set<String>> sets) {
		return sets.stream().flatMap(x -> x.stream()).collect(Collectors.toSet());		
	}
	


}
