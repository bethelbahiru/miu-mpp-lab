package prob2;

public interface Polygon extends ClosedCurve {
	
	public abstract double[] getLength();
	
	default double computePerimeter() {
		double [] sides = getLength();
		double total = 0.0;
		for (int i =0; i < sides.length; i++) {
			total += sides[i];
		}
		return total;
	}

}
