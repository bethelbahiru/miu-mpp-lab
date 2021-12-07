package prob4;

import java.time.LocalDate;

public class CustOrderFactory {
	
    private CustOrderFactory(){}
    
    public static Customer getCustomerInstance(String name){
        return new Customer(name);
    }

    public static Order getOrderInstance(Customer cust, LocalDate date){
        if(cust == null) throw new NullPointerException("Null customer");
		Order ord = new Order(date);
		cust.addOrder(ord);
		return ord;
    }
}
