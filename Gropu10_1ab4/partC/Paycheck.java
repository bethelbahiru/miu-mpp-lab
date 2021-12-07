package partC;

public final class Paycheck {
	
	private final double fica; 
	private final double StateTax;
	private final double LocalTax; 
	private final double Medicare;
	private final double Social;
	private final double gross;
	
	public Paycheck (double gross, double fica, 
					double stateTax, double localTax, 
					double medicare, double social){
		this.gross = gross;
		this.fica = fica;
		this.StateTax = stateTax;
		this.LocalTax = localTax;
		this.Medicare = medicare;
		this.Social = social;
		
	}

	public double getFica() {
		return fica * gross;
	}
	
	public double getGross() {
		return gross;
	}

	public double getStateTax() {
		return StateTax * gross;
	}

	public double getLocalTax() {
		return LocalTax * gross;
	}

	public double getMedicare() {
		return Medicare * gross;
	}

	public double getSocial() {
		return Social * gross;
	}
	
	public void print() {
		System.out.println("Paystub: \n "
				+ "  Gross Pay: " + gross + "\n"
				+ "  Fica: " + fica  + "\n" 
				+ "  State: " + StateTax  + "\n" 
				+ "  Local: " + LocalTax  + "\n" 
				+ "  Medicare: " + Medicare  + "\n" 
				+ "  Social Security: " + Social + "\n" 
				+ "  NET PAY: " + getNetPay());
	}

	public double getNetPay() {
		return gross - (getMedicare() + getSocial() + getLocalTax() + getStateTax() + getFica());
	}


}
