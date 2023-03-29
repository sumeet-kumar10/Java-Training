package Exercise6;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewMain {
	static int count = 0;

	public static void characterTotal(char alphabet) {
		count++;
		System.out.println("Running total of character is: " + count);
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int count = 0;

			ExecutorService es = Executors.newFixedThreadPool(1);
			es.execute(() -> {
				while (count == 0) {
					try {
						System.out.println("Choose a letter");
						char letter = input.next().charAt(0);

						if (Character.toString(letter).matches("[a-zA-Z]*$")) {
							characterTotal(letter);
						} else
							throw new NumberFormatException();
					} catch (NumberFormatException e) {
						System.out.println(e);
					}
				}
			});
			es.shutdown();
		}

	}
}
