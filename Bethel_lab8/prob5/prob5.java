package prob5;

import java.util.Arrays;

public class prob5 {
	
	public static void main(String[] args) {
		
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
				
		Arrays.sort(names, String::compareToIgnoreCase);
		
		for (String s: names) {
			System.out.println(s);
		}
	}
}
