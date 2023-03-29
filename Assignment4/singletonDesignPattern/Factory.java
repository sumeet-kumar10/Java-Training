package singletonDesignPattern;

public class Factory {
	private static Factory instance;

	private Factory() {

	}

	public static String getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return "JAVA";
	}

}
