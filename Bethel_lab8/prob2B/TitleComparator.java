package prob2B;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
