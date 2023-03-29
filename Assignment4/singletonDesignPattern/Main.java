package singletonDesignPattern;

public class Main {

	public static void main(String[] args) {

		String object1 = Factory.getInstance();

		String object2 = Factory.getInstance();

		String object3 = Factory.getInstance();

		System.out.println("object 1 " + object1);
		System.out.println("object 2 " + object2);
		System.out.println("object 3 " + object3);

		System.out.println("object check " + object1.equals(object2));
		System.out.println("object 2 hashCode " + object2.hashCode());
		System.out.println("object 3 hashCode " + object3.hashCode());
	}

}