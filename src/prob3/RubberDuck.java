package prob3;

public class RubberDuck extends Duck implements Squeak, CannotFly{

	RubberDuck() {
	}

	@Override
	public void display() {
		System.out.println("Displaying");
	}
	

}
