package prob2;

public final class Rectangle implements Figure {

	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double computeArea() {
		return width * length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double geLength() {
		return length;
	}

}
