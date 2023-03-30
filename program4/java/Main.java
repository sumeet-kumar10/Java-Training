package program4.java;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException{
	try (FileInputStream source = new FileInputStream("/Users/sumeetkumar/eclipse-workspace/Day7/src/program4/java/masangudi.png");
		FileOutputStream destination = new FileOutputStream("/Users/sumeetkumar/eclipse-workspace/Day7/src/program4/java/copy.png")) {
			
			byte[] byteArray = new byte[1024];
			int length;
			while((length = source.read(byteArray)) >0) {
				destination.write(byteArray,0,length);
			}
			System.out.println("Image Copied");
		}
	}

}


