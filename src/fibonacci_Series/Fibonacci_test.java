package fibonacci_Series;

public class Fibonacci_test {

	public static int Fibonacci(int count) {
		
		
		if (count <= 1 || count<=2) {
			return 1;
		}

		return ((count - 1) + (count - 2));
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(Fibonacci(i)+" ");
		}

	}
}
