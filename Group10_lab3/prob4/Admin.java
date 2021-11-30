package prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		
		for(Property p: properties) {
			System.out.println(p.getRent());
			totalRent += p.computeRent();
		}
		
		return totalRent;
	}
}
