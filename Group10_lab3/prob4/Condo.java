package prob4;

public class Condo extends Property {
	
	private int numOfFloor;
	
	public Condo(int numOfFloor) {
		super();
		this.numOfFloor = numOfFloor;
	}

	public int getNumOfFloor() {
		return numOfFloor;
	}
	
	@Override
	public double computeRent() {
		return 400 * numOfFloor;	
	}

}
