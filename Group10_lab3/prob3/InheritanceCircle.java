package prob3;

public class InheritanceCircle extends InheritanceCyclinder {
	
	private double radius;

	public InheritanceCircle(double radius, double height) {
		super(height, radius);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
