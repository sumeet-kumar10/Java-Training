package Exercise7;

public class Main {
	public static void main(String[] args) {
		newThread t1 = new newThread();
		t1.start();
	}
}

class newThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			PrintNumber.number(i);

		}
	}
}

class PrintNumber {
	static void number(int num) {
		try {
			Thread.sleep(1000);

			if (num % 10 == 0) {
				System.out.println("Printing string....");
			} else {
				System.out.println(num);

			}
		} catch (Exception e) {
		}

	}
}
