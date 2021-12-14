package prob3;
import java.util.ArrayList;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
			List<String> words = new ArrayList<String>();
			words.add("hecc");
			words.add("ckcc");
			words.add("dccl");
			words.add("cccc");
			words.add("dddd");
			words.add("aaaaa");
			words.add("dfs");
			System.out.println(countWords(words,'c','d',4));
		
	}
	
	 static int countWords(List<String> words, char c, char d, int len) {     
		 	return (int) words.stream().filter(x -> x.length() == len)
		 				  .filter(x -> x.contains(String.valueOf(c)) && !x.contains(String.valueOf(d))).count(); 
		 	
	 }

}
