package exercise1;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i <= 100; i += 2) {

					System.out.println(i);

				}

			}
		};

		t1.start();
		t1.join(0);

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i += 2) {

					System.out.println(i);

				}
			}
		};
		t2.start();

	}

}

