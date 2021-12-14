package prob9;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("************* Any Vegeterian*************");
		System.out.println(Dish.isAnyVegeterian());
		System.out.println("************* Any Healthy Menu*************");
		System.out.println(Dish.anyHealthyMenu());
		System.out.println("************* Any Unhealthy Menu*************");
		System.out.println(Dish.anyUnHealthyMenu());
		System.out.println("************* Total Calories*************");
		System.out.println(Dish.totalCalories());
		System.out.println("************* Total Calories Using Method Reference*************");
		System.out.println(Dish.totalCaloriesMethodReference());
		System.out.println("************* First Meat Value*************");
		System.out.println(Dish.firstMeat());


	}

}
