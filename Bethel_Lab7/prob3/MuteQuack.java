package prob3;

public interface MuteQuack extends QuackBehavior {

	default public void quack() {
		System.out.println("Cannot Quack");
	}

}
