package exercise5;

public class Program5 {
	static void MyCustom(String s) throws MyCustom {
		throw new MyCustom("Java");
	}

	public static void testMethod() {
		try {
			MyCustom("New Java");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		testMethod();
	}

}