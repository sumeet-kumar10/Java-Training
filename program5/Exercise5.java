package program5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Exercise5 {
public static void main(String[] args) throws Exception{
	
	try (BufferedReader source = new BufferedReader(new FileReader("/Users/sumeetkumar/eclipse-workspace/Day7/src/program5/text.txt"))) {
		PrintWriter printWriter = new PrintWriter(System.out);
		
		String line;
		while((line=source.readLine()) != null) {
			printWriter.println(line);
			printWriter.flush();
		}
	}
}
}
