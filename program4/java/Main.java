package program4.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
public static void main(String[] args) throws IOException{
	FileInputStream source = new FileInputStream("/Users/sumeetkumar/eclipse-workspace/Day7/src/program4/java/masangudi.png");
	FileOutputStream destination = new FileOutputStream("/Users/sumeetkumar/eclipse-workspace/Day7/src/program4/java/pollachi.png");
		
		byte[] buffer = new byte[1024];
		int bytesRead;
		while((bytesRead = source.read(buffer)) != -1) {
			destination.write(buffer,0,bytesRead);
		}
		
		System.out.println("Image Copied");
	} 
}
