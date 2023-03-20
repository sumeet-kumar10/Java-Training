package shapeInterface;

import java.util.Scanner;

public class Sphere implements Compute{
		public int getValues() {
			System.out.println("Enter the radius of sphere");
			Scanner input = new Scanner(System.in);
			
			int radius = input.nextInt();
			return radius;
		}
		
		public int calculate(int value) {
			int sphereArea = (int) (3.14*value*value);
			return sphereArea;
		}
		
		public int calculatePerimeter(int newValue) {
			int spherePerimeter = (int)(2*3.14*newValue);
			return spherePerimeter;
		}

}
