package practise_1;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 1, count = 20;

		for (int i = 0; i <= count; i++) {

			System.out.print(a + ", ");

			a = b;
			b = c;
			c = a + b;
		}

	}

}
