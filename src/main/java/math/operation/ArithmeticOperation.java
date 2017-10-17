package math.operation;

/***
 * 
 * Arithmetic Operations
 * 
 * @author Anant Goswami
 *
 */
public class ArithmeticOperation extends MathOperation {

	private static ArithmeticOperation instance = new ArithmeticOperation();

	private ArithmeticOperation() {

	}

	public static ArithmeticOperation getInstance() {
		return instance;
	}

	@Override
	public Integer add(int a, int b) {
		return a + b;
	}

	@Override
	public Integer sub(int a, int b) {
		return a - b;
	}

	@Override
	public Integer multiply(int a, int b) {
		return a * b;
	}

	@Override
	public Integer divide(int a, int b) {
		return a / b;
	}

}