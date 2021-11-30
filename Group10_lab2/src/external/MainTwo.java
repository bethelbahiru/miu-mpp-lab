package external;

import java.time.LocalDate;

import prob2B.Order;

public class MainTwo {
	public static void main(String[] args) {
		
		Order order1 = new Order(1, 21.00, 7, LocalDate.of(2021, 3, 11), 1);
		order1.addLine(2,23.00,5);
		order1.addLine(3,25.00,6);
		
		Order order2 = new Order(2, 209.00, 6, LocalDate.of(2019, 2, 9), 2);
		order2.addLine(22,203.80,9);
		order2.addLine(33,55.00,8);
		order2.addLine(13,58.00,5);
		order2.addLine(17,68.90,4);
	
	//	List<Order> orders = Arrays.asList(order1, order2, order3, order4);
		System.out.println(order1);
		System.out.println("//////////////////////////////////////////");
		System.out.println(order2);
		
		

	}


}
