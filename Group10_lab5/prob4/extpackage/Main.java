package prob4.extpackage;

import java.time.LocalDate;

import prob4.CustOrderFactory;
import prob4.Customer;
import prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.getCustomerInstance("Bob");
		Order order = CustOrderFactory.getOrderInstance(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.getOrderInstance(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
