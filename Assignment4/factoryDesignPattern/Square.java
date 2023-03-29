package factoryDesignPattern;

public class Square implements Shapes {
	private String type;

	protected Square() {
		this.type = "Square created";
	}

	public String getType() {
		return this.type;
	}

}
