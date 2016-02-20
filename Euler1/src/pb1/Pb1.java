package pb1;

/**
 * 
 * @author Ovidiu
 *
 *         Multiples of 3 and 5
 * 
 *         If we list all the natural numbers below 10 that are multiples of 3
 *         or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find
 *         the sum of all the multiples of 3 or 5 below 1000.
 */

public class Pb1 {

	private Integer belowN;

	public Pb1(Integer belowN) {
		super();
		this.belowN = belowN;
	}

	private int sumDivisibleBy(int n) {
		int p = (belowN - 1) / n;
		return n * (p * (p + 1)) / 2;
	}

	public int getSum() {
		return sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
	}

	public static void main(String[] args) {
		Pb1 pb1Test = new Pb1(1000);
		System.out.println(pb1Test.getSum());
	}
}
