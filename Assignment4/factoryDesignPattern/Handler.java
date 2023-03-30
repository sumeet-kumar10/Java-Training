package factoryDesignPattern;

public class Handler implements Shapes {
	private String type;

	protected Handler() {
		this.type = "Shape cannot created";
	}

	public String getType() {
		return this.type;
	}
}
