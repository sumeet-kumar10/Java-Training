package program1.java;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String sentence = "";
			int wordCount = 0;
			
			System.out.println("Enter the string: ");
			sentence = scan.nextLine();

			/**
			 * <p>Here I am checking the number of space available between the words</p>
			 */
			
			for (int i = 0; i < sentence.length() - 1; i++) {
				if (sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i + 1)) && (i > 0)) {
					wordCount++;
				}
			}
			wordCount++;
			System.out.println("Total number of words in the given sentence: " + wordCount);
		}
	}
}
