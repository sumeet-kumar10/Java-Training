package exercise7;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numerator, denominator;
		while (true) {
			System.out.println("Enter the numerator and divisor: ");
			numerator = input.next();
			if (numerator.equals("q") || numerator.equals("Q")) {
				break;
			}
			denominator = input.next();
			try {

				if (Integer.parseInt(denominator) == 0) {
					System.out.println("Division by zero is not allowed");

				}

				System.out.println("Result is: " + ((float) Integer.parseInt(numerator) / (float) Integer.parseInt(denominator)));
			} catch (Exception exception) {
				System.out.println("Input must be interger value");
			}

		}
	}
}
