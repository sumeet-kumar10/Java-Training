package program6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise6 {
public static void main(String[] args) throws FileNotFoundException {
	int line;
	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/sumeetkumar/eclipse-workspace/Day7/src/program6/OldFile.txt"));
		FileWriter destination = new FileWriter(new File("/Users/sumeetkumar/eclipse-workspace/Day7/src/program6/NewFile.txt"));
		
		while((line = bufferedReader.read()) != -1) {
		destination.write((char)line);
		destination.flush();
		}
		
		bufferedReader.close();
		System.out.println("file copied");
	}catch(Exception e) {
		System.out.println("copied failed");
	}
}
}
