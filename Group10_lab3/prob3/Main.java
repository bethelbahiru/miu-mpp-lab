package prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**************Composition relationship*************");
		
		Cylinder cylinder = new Cylinder(5, 2);
		
		System.out.println("Circle radius using Cylinder: " + cylinder.getCircle().getRadius());
		System.out.println("Circle area using Cylinder: " + cylinder.getCircle().computeArea());

	}

}
