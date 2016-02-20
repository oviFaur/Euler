package pb4;

/**
 * 
 * @author Ovidiu
 * 
 *         A palindromic number reads the same both ways. The largest palindrome
 *         made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 *         Find the largest palindrome made from the product of two 3-digit
 *         numbers.
 * 
 */

public class Pb4 {

	public int getLargestPalindrome() {
		int a = 999, b = 999;
		int max = 0;
		while (a > 0) {
			while (b > 0) {
				int c = a * b;
				if (isPalindrome(c)) {
					if (c > max)
						max = c;
				}
				b--;
			}
			a--;
			b = a;
		}
		return max;
	}

	public int getLargestPalindromeEff() {
		int a = 999, b;
		int max = 0;
		int db;
		while (a >= 100) {
			if (a % 11 == 0) {
				b = 999;
				db = 1;
			} else {
				b = 990;
				db = 11;
			}

			while (b >= a) {
				int c = a * b;
				if (c <= max)
					break;
				if (isPalindrome(c)) {
					max = c;
				}
				b -= db;
			}
			a--;
		}
		return max;
	}

	private boolean isPalindrome(int c) {
		String ps = new Integer(c).toString();
		String reverse = "";
		int length = ps.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + ps.charAt(i);
		return ps.equals(reverse);
	}

	public static void main(String[] args) {
		Pb4 pb4Test = new Pb4();
		System.out.println(pb4Test.getLargestPalindrome());
	}

}
