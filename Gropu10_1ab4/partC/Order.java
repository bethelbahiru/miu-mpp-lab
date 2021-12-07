package partC;

import java.time.LocalDate;

public class Order {
	
	private LocalDate orderDate;
	private String orderNumber;
	private double orderAmount;
	
	
	public Order(String orderNumber, LocalDate orderDate,  double orderAmount) {
		this.orderDate = orderDate;
		this.orderNumber = orderNumber;
		this.orderAmount = orderAmount;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public String getOrderNumber() {
		return orderNumber;
	}


	public double getOrderAmount() {
		return orderAmount;
	}

	

}
