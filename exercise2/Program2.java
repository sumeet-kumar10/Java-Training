package exercise2;

public class Program2 {
	public void mth1() {
		mth2();
		System.out.println("caller");

	}

	public void mth2() {
		try {
			int value = 1 / 0;
			return;
		} catch (Exception e) {
			System.out.println("catch-mth2");
		} finally {
			System.out.println("finally-mth2");
		}
	}

	public static void main(String p[]) {
		Program2 object = new Program2();
		object.mth1();
	}
}