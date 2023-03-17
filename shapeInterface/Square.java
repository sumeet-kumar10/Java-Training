package shapeInterface;

import java.util.Scanner;

public class Square implements Compute{
		public int getValues() {
			System.out.println("Enter the side of square");
			Scanner input = new Scanner(System.in);
			
			int side = input.nextInt();
			return side;
		}
		
		public int calculate(int value) {
			int squareArea = (int) (value*value);
			return squareArea;
		}
		
		public int calculatePerimeter(int newValue) {
			int squarePerimeter = (int)(4*newValue);
			return squarePerimeter;
		}
}
