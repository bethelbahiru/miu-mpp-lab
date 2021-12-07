package prob1;

public class MallardDuck extends Duck {

	MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
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
