package prob2A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo {
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 530.90, 7));
		products.add(new Product("PlayStation", 500.00, 5));
		products.add(new Product("Airplane", 1200.00, 2));
		
		Collections.sort(products, new PriceComparator());
		System.out.println(products);
		
	}

}
