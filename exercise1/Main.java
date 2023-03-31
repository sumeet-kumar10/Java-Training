package exercise1;

public class Main {
	public static void main(String[] args) {
		 
        Program1 program = new Program1();
        Program1 newProgram = new Program1();
        System.out.println("Primitive data type before call-by-value: " + program.variable);
        System.out.println("Object before call-by-value: " + program.newVariable);
        System.out.println("Array before call-by-value: " + newProgram.arr[0]);
        
        program.call(50,program,newProgram);
        System.out.println("Primitive data type after call-by-reference: " + program.variable);
        System.out.println("Object after reference: " + program.newVariable);
        System.out.println("Array after call-by-reference: " + newProgram.arr[0]);
        
    }
}
