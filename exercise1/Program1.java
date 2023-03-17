package exercise1;

public class Program1 {
	int variable = 10;
	int newVariable = 20;
	int[] arr = {1,2,3};
    void call(int variable, Program1 object, Program1 newObject) {
         
        variable = variable+10;
        object.newVariable = object.newVariable + 20;
        newObject.arr[0] = newObject.arr[0] + 10;
    }
}
