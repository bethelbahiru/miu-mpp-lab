package partC;

public class Hourly extends Employee {

	private double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(String id, double hourlyWage, int hoursPerWeek) {
		super.setEmpId(id);;
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public double calculateGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek * 4;
	}

}
