package exercise6;

class Derived extends Main {
	Derived() {
		try {
            Base base = new Base();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
	}
}
