package prob2C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {

	static enum Method {
		BYTITLE, BYPRICE
	}

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 530.90, 7));
		products.add(new Product("PlayStation", 500.00, 5));
		products.add(new Product("Airplane", 1200.00, 2));

		ProductInfo p = new ProductInfo();
		System.out.println("**************SORTED BY PRICE**************");
		p.sort(products, ProductInfo.Method.BYPRICE);
		System.out.println(products);
		System.out.println("**************SORTED BY TITLE**************");
		p.sort(products, ProductInfo.Method.BYTITLE);
		System.out.println(products);

	}

	private void sort(List<Product> products, final Method methods) {
		class compares implements Comparator<Product> {
			@Override
			public int compare(Product o1, Product o2) {
				if (methods.equals(Method.BYPRICE)) {
					if (o1.getPrice() == o2.getPrice())
						return 0;
					else if (o1.getPrice() < o2.getPrice())
						return -1;
					else
						return 1;
				} else {
					return o1.getTitle().compareTo(o2.getTitle());
				}
			}
		}
		Collections.sort(products, new compares());
	}

}
