package program2.java;

import java.io.File;

public class Delete {
	public void deleteOperation() {
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

}
