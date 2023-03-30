package strategyDesignPattern;

public class OperationAdd implements Strategy{
	   @Override
	   public float doOperation(float num1, float num2) {
	      return num1 + num2;
	   }
}
