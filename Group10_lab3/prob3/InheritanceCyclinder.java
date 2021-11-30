package prob3;

public class InheritanceCyclinder {
	
	private double height;
	private double radius;
	
	
	public InheritanceCyclinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeVolume() {
		return Math.PI * radius * radius * height;
	}


}
