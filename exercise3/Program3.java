package exercise3;

public class Program3 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch-mth2");
		} finally {
			System.out.println("finally-mth2");
		}
	}

	public static void main(String p[]) {
		Program3 object = new Program3();
		object.mth1();
	}
}
