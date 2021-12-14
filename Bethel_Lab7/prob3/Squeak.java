package prob3;

public interface Squeak extends QuackBehavior{

	default void quack() {
		System.out.println("Squeaking.");	
	}

}
