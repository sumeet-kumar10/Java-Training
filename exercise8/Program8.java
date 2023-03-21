package exercise8;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int index = 0;
		int[] mark = new int[10];

		System.out.println("Enter the marks of 10 students: ");
		while (index < mark.length) {
			try {
				mark[index] = Integer.parseInt(input.next());
				sum += mark[index];
				index++;

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("input must be integer");
			}
		}

		System.out.println("average mark: " + (float) sum / mark.length);
		
	}
}