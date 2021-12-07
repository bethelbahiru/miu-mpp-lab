package partC;

public class Salaried extends Employee {
	
	private double salary;

	public Salaried(String id, double salary) {
		super.setEmpId(id);
		this.salary = salary;
	}



	@Override
	public double calculateGrossPay(int month, int yr) {
		// TODO Auto-generated method stub
		return salary;
	}
	

}
