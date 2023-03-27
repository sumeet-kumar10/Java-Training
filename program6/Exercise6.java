package program6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise6 {
public static void main(String[] args) throws FileNotFoundException {
	
	FileReader source = new FileReader("/Users/sumeetkumar/eclipse-workspace/Day7/src/program6/OldFile.txt");
	
	try(FileWriter destination = new FileWriter("/Users/sumeetkumar/eclipse-workspace/Day7/src/program6/NewFile.txt")){
		
		char[] ch = new char[8];
		int i=0;
		while((i = source.read(ch)) != -1) {
			String s = new String(ch,0,i);
			System.out.println(s);
			destination.write(s);
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
}
}
