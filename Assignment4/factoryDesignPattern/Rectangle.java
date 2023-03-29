package factoryDesignPattern;

public class Rectangle implements Shapes {
	private String type;

	protected Rectangle() {
		this.type = "Rectangle created";
	}

	public String getType() {
		return this.type;
	}

}
