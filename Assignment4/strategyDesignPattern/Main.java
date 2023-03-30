package strategyDesignPattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to perform operation: ");
		float numFirst = scan.nextInt();
		float numSecond = scan.nextInt();

		System.out.println(numFirst + " + " + numSecond + " = " + context.executeStrategy(numFirst, numSecond));

		context = new Context(new OperationSubtract());
		System.out.println(numFirst + " - " + numSecond + " = " + context.executeStrategy(numFirst, numSecond));

		context = new Context(new OperationMultiply());
		System.out.println(numFirst + " * " + numSecond + " = " + context.executeStrategy(numFirst, numSecond));

		context = new Context(new OperationDivide());
		System.out.println(numFirst + " / " + numSecond + " = " + context.executeStrategy(numFirst, numSecond));
	}
}