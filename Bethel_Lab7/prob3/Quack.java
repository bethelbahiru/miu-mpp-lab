package prob3;

public interface Quack extends QuackBehavior {

	default public void quack() {
		System.out.println("Quacking.");
	}

}
