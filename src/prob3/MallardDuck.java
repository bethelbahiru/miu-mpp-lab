package prob3;

public class MallardDuck extends Duck implements FlyWithWings, Quack{

	MallardDuck() {
	}

	@Override
	public void display() {
		System.out.println("Displaying");
	}
	
}
