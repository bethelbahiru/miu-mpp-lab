package prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		System.out.println("************ Query 1 *****************");
		transactions.stream().filter(x -> x.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(x-> System.out.println(x));

		// Query 2: What are all the unique cities where the traders work?
		
		System.out.println("************ Query 2 *****************");
    	transactions.stream().map(x -> x.getTrader().getCity()).distinct().forEach(System.out::println);

		// Query 3: Find all traders from Cambridge and sort them by name.
    	
    	System.out.println("************ Query 3 *****************");
    	transactions.stream().map(x -> x.getTrader()).filter(x -> x.getCity() == "Cambridge").distinct().sorted(Comparator.comparing(Trader::getName)).forEach(x-> System.out.println(x));

		// Query 4: Return a string of all traders names sorted alphabetically.
    	
    	System.out.println("************ Query 4 *****************");
    	
    	String allName = transactions.stream().map(x -> x.getTrader().getName()).distinct().sorted().collect(Collectors.joining(""));
    	System.out.println(allName);
    	
    	System.out.println("************ Query 5 *****************");
		// Query 5: Are there any trader based in Milan?
    	Optional<Trader> milan = transactions.stream().map(x -> x.getTrader()).filter(x -> x.getCity() == "Milan").findFirst();
    	System.out.println(milan.orElse(null));
    	
    	System.out.println("************ Query 6 *****************");
		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
    	
    	transactions.stream().map(x -> x.getTrader()).filter(x -> x.getCity() == "Milan").forEach(x -> x.setCity("Cambridge"));
    	System.out.println(transactions);
    	
    	System.out.println("************ Query 7 *****************");
		// Query 7: What's the highest value in all the transactions?
    	Optional<Integer> max = transactions.stream().map(x -> x.getValue()).max(Integer::compare);
    	System.out.println(max.orElse(0));
	}
}
