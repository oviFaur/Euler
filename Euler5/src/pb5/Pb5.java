package pb5;

/**
 * 
 * @author Ovidiu
 * 
 *         2520 is the smallest number that can be divided by each of the
 *         numbers from 1 to 10 without any remainder. What is the smallest
 *         positive number that is evenly divisible by all of the numbers from 1
 *         to 20?
 * 
 */

public class Pb5 {

	private long gcd(long a, long b) {
		while (b > 0) {
			long temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

	private long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	private long lcm(long[] input) {
		long result = input[0];
		for (int i = 1; i < input.length; i++)
			result = lcm(result, input[i]);
		return result;
	}

	public static void main(String[] args) {
		Pb5 pb5Test = new Pb5();
		long input[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(pb5Test.lcm(input));
	}
}
