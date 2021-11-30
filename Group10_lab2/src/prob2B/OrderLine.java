package prob2B;

public class OrderLine {
	
	private int linenum;
	private double price;
	private int quantity;
	private Order orders;
	
	public OrderLine(int linenum, double price, int quantity, Order order) {
		this.linenum = linenum;
		this.price = price;
		this.quantity = quantity;
		this.orders = order;
	}
	
	public String toString() {
		return "Order Line: " + this.linenum + " Price: " + this.price + " Quantity: " + this.quantity;
	}
	
	

}
