package Exercise5;

public class Main {

	public static void main(String[] args) {

		MyRunnable thread = new MyRunnable();
		thread.start();
		thread.start();

	}

}

class MyRunnable extends Thread {
	public void run() {

		System.out.println("Thread running is: " + Thread.currentThread().getName());

	}
}
