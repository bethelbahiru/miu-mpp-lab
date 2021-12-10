package prob2;

public class EQTriangle implements Polygon {
	
	private double side;
	
	public EQTriangle(double side) {
		this.side = side;
	}

	@Override
	public double[] getLength() {
		// TODO Auto-generated method stub
		return new double[] {side,side,side};
	}
	
	public double getSide() {
		return side;
	}

}
