package prob3;

public interface CannotFly extends FlyBehavior {

	default void fly() {
		System.out.println("Cannot Fly.");
	}

}
