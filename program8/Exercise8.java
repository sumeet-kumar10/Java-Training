package program8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Exercise8 {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		try {
			FileInputStream source = new FileInputStream("/Users/sumeetkumar/eclipse-workspace/Day7/src/program8/Sample.txt");
			FileOutputStream destination = new FileOutputStream("/Users/sumeetkumar/eclipse-workspace/Day7/src/program8/Sample.txt");

			ObjectOutputStream outputObject = new ObjectOutputStream(destination);
			try (ObjectInputStream InputObject = new ObjectInputStream(source)) {
				outputObject.writeObject(date);
				System.out.println("The object was succesfully written to a file");
				System.out.println(InputObject.readObject());
			}

			outputObject.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
