package strategyDesignPattern;

public class OperationDivide implements Strategy {
	public float doOperation(float num1, float num2) {
		return num1 / num2;
	}
}
