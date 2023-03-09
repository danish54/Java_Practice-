package fibonacci_Series;

public class Fibonacce_Series_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFibonacciSeries(10);

	}

	public static void printFibonacciSeries(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}

	}

}
