package program7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("/Users/sumeetkumar/eclipse-workspace/Day7/src/program7/OldFile.txt");
			
			BufferedReader bufferReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("/Users/sumeetkumar/eclipse-workspace/Day7/src/program7/NewFile.txt",true);
			String str;

			while ((str = bufferReader.readLine()) != null) {
				fileWriter.write(str);
				fileWriter.flush();
			}
			bufferReader.close();
			fileWriter.close();
			System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}