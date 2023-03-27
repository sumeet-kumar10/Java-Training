package program5;

import java.io.FileReader;

public class Exercise5 {
public static void main(String[] args) throws Exception{
	
	FileReader source = new FileReader("/Users/sumeetkumar/eclipse-workspace/Day7/src/program5/text.txt");
	
	char[] character = new char[8];
	int i = 0;
	while((i=source.read(character)) != -1) {
		String str = new String(character,0,i);
		System.out.println(str);
	}
}
}
