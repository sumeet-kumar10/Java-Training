package flyWeightBridge;

public class Main {
	private static final String colors[] = { "Red", "Green", "Blue"};

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomLength() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomWidth() {
		return (int) (Math.random() * 100);
	}

	public static void main(String args[]) {
		for (int i = 0; i < 10; ++i) {
			Rectangle rectangle = (Rectangle) ShapeFactory.getCircle(getRandomColor());
			rectangle.setLength(getRandomLength());
			rectangle.setWidth(getRandomWidth());
			rectangle.createShape();
		}
	}
}