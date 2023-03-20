package shapeInterface;

import java.util.Scanner;


public class Triangle implements Compute{
		public int getValues() {
			System.out.println("Enter the side of triangle");
			Scanner input = new Scanner(System.in);
			
			int side = input.nextInt();
			return side;
		}
		
		public int calculate(int value) {
			int triangleArea = (int) (0.5*value*value);
			return triangleArea;
		}
		
		public int calculatePerimeter(int newValue) {
			int trianglePerimeter = (int)(newValue*3);
			return trianglePerimeter;
		}
}
