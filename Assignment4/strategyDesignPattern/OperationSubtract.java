package strategyDesignPattern;

public class OperationSubtract implements Strategy {
	@Override
	public float doOperation(float num1, float num2) {
		return num1 - num2;
	}
}