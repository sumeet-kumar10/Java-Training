package factoryDesignPattern;

public class Test {
	public static void main(String[] args) {
		Factory factory = new Factory();

		Shapes square = factory.getShape("Square");
		System.out.println(square.getType());

		Shapes rectangle = factory.getShape("Oval");
		System.out.println(rectangle.getType());

		Shapes circle = factory.getShape("Circle");
		System.out.println(circle.getType());
	}
}