package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MyInterface {

	public static void main(String[] args) {

		BiFunction<Double,Double,List<Double>> exp =  (x,y) -> {
			List<Double> a = new ArrayList<Double>();
			a.add(Math.pow(x,y));
			a.add(x * y);
			return a;		
		};
		
		List<Double> result = exp.apply(2.0, 3.0);
		System.out.println(Arrays.asList(result));
	
	}

}
