package prob4;

public abstract class Property {
	
	private Address address;
	private double rent;
	
	public Property() {
		address = new Address();
	}
	
	public Address getAddress() {
		return address;
	}
	
	public double getRent() {
		return rent;
	}
	
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public abstract double computeRent();

}
