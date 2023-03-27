package flyWeightBridge;

public class Rectangle implements Shape {
	private String color;
	private int length;
	private int width;

	public Rectangle(String color) {
		this.color = color;
	}

	@Override
	public void createShape() {
		System.out.println("Rectangle created with following properties:");
		System.out.println("Color: " + color);
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}

	public int setLength(int length) {
		this.length = length;
		return length;
	}

	public int setWidth(int width) {
		this.width = width;
		return width;
	}

}
