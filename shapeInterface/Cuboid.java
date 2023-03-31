package shapeInterface;

import java.util.Scanner;

public class Cuboid implements Compute{
		public int getValues() {
			System.out.println("Enter the side of cuboid");
			Scanner input = new Scanner(System.in);
			
			int side = input.nextInt();
			return side;
		}
		
		public int calculate(int value) {
			int cuboidArea = (int) (value*value);
			return cuboidArea;
		}
		
		public int calculatePerimeter(int newValue) {
			int cuboidPerimeter = (int)(4*newValue);
			return cuboidPerimeter;
		}

}
