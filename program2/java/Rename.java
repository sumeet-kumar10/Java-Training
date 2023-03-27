package program2.java;

import java.io.File;

public class Rename {
	public void doRename() {
		File oldName = new File("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/rename.txt");
		File newName = new File("/Users/sumeetkumar/eclipse-workspace/Day7/src/program2/java/java.txt");

		if (oldName.renameTo(newName)) {
			System.out.println("File renamed successful");
		} else {
			System.out.println("Error in rename");
		}
	}
}
