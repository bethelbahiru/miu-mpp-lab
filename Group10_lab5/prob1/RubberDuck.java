package prob1;

public class RubberDuck extends Duck{

	RubberDuck() {
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new Squeak());
	}
	@Override
	public void swim() {
		System.out.println("Swimming");
	}

	@Override
	public void display() {
		System.out.println("Displaying");
	}

}
