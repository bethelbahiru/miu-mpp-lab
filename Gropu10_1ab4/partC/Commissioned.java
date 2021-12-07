package partC;

import java.time.LocalDate;
import java.util.ArrayList;

public class Commissioned extends Employee {
	
	private ArrayList<Order> orders;
	private double commission;
	private double baseSalary;

	public Commissioned(String id, double commission, double baseSalary, ArrayList<Order> orders) {
		super.setEmpId(id);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}
	
	public double addOrder(int month, int year) {
		return year;
		
	}

	@Override
	public double calculateGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		double total = 0;
		LocalDate currentMon = LocalDate.of(year, month, 1);
		for (Order o: orders) {
			if ((currentMon.getMonthValue() - o.getOrderDate().getMonthValue() == 1 &&
					currentMon.getYear() == o.getOrderDate().getYear()) || (currentMon.getMonthValue() == 1 && o.getOrderDate().getMonthValue() == 12 && currentMon.getYear() - o.getOrderDate().getYear() == 1 ) ) {
				total += o.getOrderAmount();
			}
		}
		return baseSalary + commission * total;
	}
	
}
