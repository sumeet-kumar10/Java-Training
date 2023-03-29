package Exercise3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
	int count = 0;

	synchronized public void producer() {
		if (count > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		count++;
		System.out.println("Product is added to inventory");

		notify();
	}

	synchronized public void consumer() {
		if (count <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println("Product is consumed");
		count--;
		notify();
	}
}

public class NewMain {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Main object = new Main();

		es.execute(() -> {
			Thread.currentThread().setName("Producer");
			for (int i = 0; i < 5; i++) {
				object.producer();
			}
		});

		es.execute(() -> {
			Thread.currentThread().setName("Consume");
			for (int i = 0; i < 5; i++) {
				object.consumer();
			}
		});
		es.shutdown();
	}
}
