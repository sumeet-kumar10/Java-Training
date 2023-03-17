package shapeInterface;

import java.util.Scanner;

public class Circle implements Compute{

		public int getValues() {
			System.out.println("Enter the radius of circle");
			Scanner input = new Scanner(System.in);
			
			int radius = input.nextInt();
			return radius;
		}
		
		public int calculate(int value) {
			int circleArea = (int) (3.14*value*value);
			return circleArea;
		}
		
		public int calculatePerimeter(int newValue) {
			int circlePerimeter = (int)(3.14*2*newValue);
			return circlePerimeter;
		}

}
