package recursion;

public class Fibonacci_recursion {

	public static int Fibonacci(int count) {
		if (count <= 1) {
			return count;
		}

		return Fibonacci(count - 1) + Fibonacci(count - 2);

	}

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.print(Fibonacci(i)+" ");
		}

	}

}
