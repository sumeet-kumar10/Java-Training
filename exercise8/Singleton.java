package exercise8;

//import assignments.Program8;

public class Singleton {
	private static Singleton object = new Singleton();
	  public String string;


	  private Singleton()
	  {
	    string = "This is the example for singleton class";
	  }

	  public static Singleton getInstance()
	  {
	    return object;
	  }
}
