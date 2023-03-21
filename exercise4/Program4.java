package exercise4;

public class Program4 {
	static void checkAge(int age) throws MyCustom {
		if (age < 18) {
			throw new MyCustom("Age is not valid to vote");
		} else {
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String args[]) {
		try {
			checkAge(13);
		} catch (MyCustom ex) {
			ex.printStackTrace();

		}
	}
}
