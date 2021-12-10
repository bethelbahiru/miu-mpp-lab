package prob4;
import java.util.function.Consumer;

public class Consumers implements Consumer<String> {
	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.print(t.toUpperCase());
	}
	
}