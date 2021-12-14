package prob4;

import java.util.stream.IntStream;

public class Problem4 {

	public static void main(String[] args) {
		printSquares(4);
	}
	
	public static void printSquares(int num) {
		IntStream.iterate(1, x -> (int) Math.pow((int) Math.sqrt(x) + 1, 2)).limit(num)
		.forEach(x -> System.out.println(x));;
	}

}