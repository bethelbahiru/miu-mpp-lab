package prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Section {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.limit(n+1).skip(m);

	}

public static void main(String[] args) {
	Stream<String> sb = streamSection(nextStream(), 0, 3);
	sb.forEach(System.out::println);
	
	System.out.println("**************************************************");
	
	Stream<String> sb2 = streamSection(nextStream(), 2, 5);
	sb2.forEach(System.out::println);
	
 }

//support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
