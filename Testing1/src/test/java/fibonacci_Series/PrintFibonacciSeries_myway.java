package fibonacci_Series;

import java.util.Scanner;

public class PrintFibonacciSeries_myway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number here :");
			int count = sc.nextInt();
			int a = 0, b = 1, c;

			System.out.print(a + " " + b);

			for (int i = 0; i <= count; i++) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
		}
	}

}
