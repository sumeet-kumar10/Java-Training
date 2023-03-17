package stackOperation;


public class Main {
public static void main(String[] args) {
		
		FixedStack fixedStack = new FixedStack();
		DynamicStack dynamicStack = new DynamicStack();
			
		System.out.println("Fixed Stack");
		fixedStack.push();
		fixedStack.pop();
		
		
		System.out.println("Dynamic Stack");
		dynamicStack.push();
		dynamicStack.pop();
	}
}
