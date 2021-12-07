package prob1;

public class DecoyDuck extends Duck{

	DecoyDuck() {
		setFlyBehavior(new CannotFly());
		setQuackBehavior(new MuteQuack());
	}
	@Override
	public void swim() {
		System.out.println("Swimming.");
	}

	@Override
	public void display() {
		System.out.println("Displaying.");
	}

}
