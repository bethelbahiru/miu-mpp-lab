package prob4;

public class House extends Property {
	
	private int lotSize;
	
	public House(int lotSize) {
		super();
		this.lotSize = lotSize;
	}

	public int getLotSize() {
		return lotSize;
	}
	
	@Override
	public double computeRent() {
		return 0.1 * lotSize;	
	}

}
