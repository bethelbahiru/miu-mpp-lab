package prob2;

public class Main {
	public static void main(String[] args) {
		double totalArea = 0;
		
		Figure[] figures = { new Triangle(2, 5), new Rectangle(4, 5), new Circle(3)};
		
		for(Figure f: figures) {
			totalArea += f.computeArea();
		}
		
		System.out.println("Sum of area is: " + totalArea);
	}
}
