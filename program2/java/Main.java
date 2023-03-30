package program2.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		int choice;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the file you want to perform");
			System.out.println("Press 1 for delete");
			System.out.println("Press 2 for rename");
			System.out.println("Press 3 for size");
			choice = scan.nextInt();
		}

		switch (choice) {
		case 1:
			Operations.deleteOperation();
			break;
		case 2:
			Operations.doRename();
			break;
		case 3:
			Operations.getFileSize("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/size.txt");
			break;
		default:
			System.out.println("Enter valid choice");
		}
	}
}

/**
 *<p> The below class contains all the operations method </p>
 * @author sumeetkumar
 *
 */

class Operations{
	public static void deleteOperation() {
		try {
			File file = new File("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/temp.txt");
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted");
			} else {
				System.out.println("failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doRename() {
		File oldName = new File("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/temporary.txt");
		File newName = new File("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/rename.txt");

		if (oldName.renameTo(newName)) {
			System.out.println("File renamed successful");
		} else {
			System.out.println("Error in rename");
		}
	}
	
	public static void getFileSize(String filename) throws FileNotFoundException{
		File file = new File(filename);
		if (!file.exists() || !file.isFile() || !file.canRead()) {
			System.out.println("File doesn't exist");
		}
		System.out.println("Filesize in bytes: " + file.length());
	}
}