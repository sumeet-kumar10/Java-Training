package program3.java;

import java.io.File;
import java.io.IOException;

public class Exercise3 {
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);

		String[] directory = file.list();

		for (int i = 0; i < directory.length; i++) {
			System.out.println(directory[i]);
		}
	}
}

