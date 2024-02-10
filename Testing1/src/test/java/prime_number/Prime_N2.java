package prime_number;

public class Prime_N2 {

	public static void main(String[] args) {
		// using boolean

		System.out.println(isPrime(2)); // true
		System.out.println(isPrime(49)); // false
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
