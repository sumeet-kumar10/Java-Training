package exercise8;

public class Main {
public static void main(String[] args) {
		
		Singleton text = Singleton.getInstance();
	    System.out.println("Original String:");
	    System.out.println(text.string);


	    System.out.println("String in Upper Case:");
	    text.string = (text.string).toUpperCase();
	    System.out.println(text.string);
	}
}
