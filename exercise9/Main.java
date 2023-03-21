package exercise9;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int index = 0;
		int[] mark = new int[10];

		System.out.println("Enter the marks of 10 students: ");
		while (index < mark.length) {

			try {
				mark[index] = Integer.parseInt(input.next());

				if (mark[index] < 0 || mark[index] > 100) {
					throw new Exception();
				}
				sum += mark[index];
				index++;
			}

			catch (Exception ex) {
				System.out.println("Value out of range");

			}

		}
		System.out.println("average mark: " + (float) sum / mark.length);
	}

}
