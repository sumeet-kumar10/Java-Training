package stackOperation;

import java.util.Stack;
public class DynamicStack implements NewStack{

		public void push() {
			Stack<Integer> stack = new Stack<Integer>();
			
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			
			System.out.println("Stack is: "+stack);
			
			
		}
		
		public void pop() {
			Stack<Integer> newStack = new Stack<>();
			newStack.push(23);
			newStack.push(34);
			newStack.push(45);
			System.out.println("Stack is: "+newStack);
			newStack.pop();
			System.out.println("Stack is: "+newStack);
			
		}

}
