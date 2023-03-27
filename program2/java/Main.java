package program2.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int choice;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the file you want to perform");
		System.out.println("Press 1 for delete");
		System.out.println("Press 2 for rename");
		System.out.println("Press 3 for size");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			Delete delete = new Delete();
			delete.deleteOperation();
			break;
		case 2:
			Rename rename = new Rename();
			rename.doRename();
			break;
		case 3:
			Size size = new Size();
			size.getFileSize("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/size.txt");
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}
}