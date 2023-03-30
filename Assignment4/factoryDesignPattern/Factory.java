package factoryDesignPattern;

public class Factory {
	public Shapes getShape(String type) {
		if (type.equalsIgnoreCase("square")) {
			return new Square();
		} else if (type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (type.equalsIgnoreCase("circle")) {
			return new Circle();
		} else {
			return new Handler();
		}

	}
}
