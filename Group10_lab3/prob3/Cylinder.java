package prob3;

public class Cylinder {
	
	private double height;
	private double radius;
	private Circle circle;
	
	
	public Cylinder(double height, double radius) {
		circle = new Circle(radius);
		this.height = height;
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Circle getCircle() {
		return circle;
	}
	
	public double computeVolume() {
		return Math.PI * radius * radius * height;
	}

	

}
