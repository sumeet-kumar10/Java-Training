package shapeInterface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Press 1 for circle");
		System.out.println("Press 2 for square");
		System.out.println("Press 3 for triangle");
		System.out.println("Press 4 for sphere");
		System.out.println("Press 5 for cuboid");
		int choice = input.nextInt();
		
		switch(choice) {
		case 1: Circle circle = new Circle();
				int radiusValue = circle.getValues();
				int areaValue = circle.calculate(radiusValue);
				int perimeterValue = circle.calculate(radiusValue);
				System.out.println("Cicle Area is: "+(float)areaValue);
				System.out.println("Circle perimeter is: "+(float)perimeterValue);
				break;
				
		case 2: Square square = new Square();
				int squareValue = square.getValues();
				int squareArea = square.calculate(squareValue);
				int squarePerimeter = square.calculatePerimeter(squareValue);
				System.out.println("Square Area is: "+(float)squareArea);
				System.out.println("Square perimeter is: "+(float)squarePerimeter);
				break;
				
		case 3: Triangle triangle = new Triangle();
				int triangleValue = triangle.getValues();
				int triangleArea = triangle.calculate(triangleValue);
				int trianglePerimeter = triangle.calculatePerimeter(triangleValue);
				System.out.println("Triangle Area is: "+(float)triangleArea);
				System.out.println("Triangle perimeter is: "+(float)trianglePerimeter);
				break;
				
		case 4: Sphere sphere = new Sphere();
				int sphereValue = sphere.getValues();
				int sphereArea = sphere.calculate(sphereValue);
				int spherePerimeter = sphere.calculatePerimeter(sphereValue);
				System.out.println("Sphere Area is: "+(float)sphereArea);
				System.out.println("Sphere perimeter is: "+(float)spherePerimeter);
				System.out.println("Sphere surface area is: "+(float)4*sphereArea);
				System.out.println("Sphere volumn is: "+(float)1.33*sphereValue*sphereArea);
				break;
		
		case 5: Cuboid cuboid = new Cuboid();
				int cuboidValue = cuboid.getValues();
				int cuboidArea = cuboid.calculate(cuboidValue);
				int cuboidPerimeter = cuboid.calculatePerimeter(cuboidValue);
				System.out.println("Cuboid Area is: "+(float)cuboidArea);
				System.out.println("Cuboid perimeter is: "+(float)cuboidPerimeter);
				System.out.println("Cuboide surface area: "+(float)6*cuboidArea);
				System.out.println("Cuboid volumn is: "+(float)cuboidValue*cuboidArea);
				break;
				
		default: System.out.println("Enter Valid Choice");
		}
	}
}
