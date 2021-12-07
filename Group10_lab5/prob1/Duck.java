package prob1;

public abstract class Duck {
	
	FlyBehavior fB;
	QuackBehavior qB;
	
	public void fly() {
		fB.fly();
	}
	
	public void quack() {
		qB.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fB) {
		this.fB = fB;
	}
	
	public void setQuackBehavior(QuackBehavior qB) {
		this.qB = qB;
	}
	
	public abstract void swim();
	
	public abstract void display();

}
