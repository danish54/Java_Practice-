package prime_number;

public class is_Prime {

	public static void main(String[] args) {
		// My Way

		int num = 9;
		int temp = 0;

		if (num == 0 || num == 1) {
			temp++;
		}

		for (int n = 2; n <= num; n++) {
			if (num % n == 0) {
				temp++;

			}

		}

		if (temp == 0) {
			System.out.println(num + " is a prime number!");
		} else {
			System.out.println(num + " is not a prime number!");
		}

	}

}
