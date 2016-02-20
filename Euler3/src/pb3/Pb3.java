package pb3;

/**
 * 
 * @author Ovidiu
 *
 *         The prime factors of 13195 are 5, 7, 13 and 29. What is the largest
 *         prime factor of the number 600851475143 ?
 */

public class Pb3 {

	private Long number;

	public Pb3(Long number) {
		super();
		this.number = number;
	}

	public Long getLargestPrimeFactor() {
		Long prime = 3L;
		while (number > 1) {
			while (number % prime == 0) {
				number = number / prime;
			}
			if (number == 1) {
				return prime;
			}
			prime = getNextPrime(prime);
		}
		return prime;
	}

	private Long getNextPrime(Long prime) {
		for (Long newPrime = prime + 1; newPrime < Long.MAX_VALUE; newPrime++) {
			if (isPrime(newPrime)) {
				return newPrime;
			}
		}
		return -1L;
	}

	private boolean isPrime(Long newPrime) {
		for (int i = 2; i < newPrime / 2; i++) {
			if (newPrime % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Pb3 pb3Test = new Pb3(600851475143L);
		System.out.println(pb3Test.getLargestPrimeFactor());
	}
}
