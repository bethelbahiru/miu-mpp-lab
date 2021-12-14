package prob3;

public interface FlyWithWings extends FlyBehavior {

	default void fly() {
		System.out.println("Fly with Wings.");
	}

}
