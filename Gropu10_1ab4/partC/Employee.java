package partC;

public abstract class Employee {
	
	private String empId;

	public String getEmpId() {
		return empId;
	}
	
	public Paycheck calcCompunsation(int month, int year) {
		double grossPay = calculateGrossPay(month, year);
		return new Paycheck(grossPay, 0.23, 0.05, 0.01, 0.03, 0.075);
		}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void print (int month, int year) {
		Paycheck p = calcCompunsation(month, year);
		p.print();
	}

	public abstract double calculateGrossPay(int month, int year);

}
