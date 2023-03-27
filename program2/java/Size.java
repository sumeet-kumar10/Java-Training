package program2.java;

import java.io.File;

public class Size {

	public void getFileSize(String filename) {
		File file = new File(filename);
		if (!file.exists() || !file.isFile()) {
			System.out.println("File doesn't exist");
		}
		System.out.println("Filesize in bytes: " + file.length());
	}

}
