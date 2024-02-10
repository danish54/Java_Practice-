package pattern;

public class Pyramid2 {

	public static void main(String[] args) {

		int r = 5, c = 5;

		for (int i = 0; i <= r; i++) {

			for (int j = 0; j <= r - i; j++) {
				System.out.print(" ");

			}

			for (int j = 0; j <= i*2; j++) {

				System.out.print("*");
			}
			
			System.out.println();

		}

	}

}
