package pb2;

/****
 * 
 * @author Ovidiu
 *
 *         Each new term in the Fibonacci sequence is generated by adding the
 *         previous two terms. By starting with 1 and 2, the first 10 terms will
 *         be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... By considering the terms
 *         in the Fibonacci sequence whose values do not exceed four million,
 *         find the sum of the even-valued terms.
 */
public class Pb2 {

	private int maxVal;

	public Pb2(int maxVal) {
		super();
		this.maxVal = maxVal;
	}

	public int getEvenValuedSum() {
		int sum = 0;
		if (maxVal == 1 || maxVal == 2) {
			sum = 2;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		while (fibonacci < maxVal) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			if (fibonacci % 2 == 0) {
				sum += fibonacci;
			}
		}
		return sum;
	}

	public int getEvenValuedSumNoTest() {
		int sum = 0;
		int fibo1 = 1, fibo2 = 1, fibonacci = 2;
		while (fibonacci < maxVal) {
			sum = sum + fibonacci;
			fibo1 = fibo2 + fibonacci;
			fibo2 = fibonacci + fibo1;
			fibonacci = fibo1 + fibo2;
		}
		return sum;
	}

	public static void main(String[] args) {
		Pb2 pb2Test = new Pb2(4000000);
		// System.out.println(pb2Test.getEvenValuedSum());
		System.out.println(pb2Test.getEvenValuedSumNoTest());
	}
}
