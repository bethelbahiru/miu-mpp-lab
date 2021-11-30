package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	
	private LocalDate date;
	private int orderNum;
	private ArrayList<OrderLine> orderLine;
	
	public Order(int lineNum, double pr, int qt, LocalDate date, int orderNum) {
		orderLine = new ArrayList<OrderLine>();
		this.date = date;
		this.orderNum = orderNum;
		addLine(lineNum, pr, qt);
	}
	
	public void addLine(int lineNum, double pr, int qt){
		orderLine.add(new OrderLine(lineNum, pr, qt, this));
	}

	public int getOrderNum() {
		return orderNum;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public String toString() {
		String result = "Order Information" + this.orderNum + " " + this.date + " ";
		for (OrderLine or: orderLine) {
			result += "\n" + or.toString();
		}
		return result;
	}

}
