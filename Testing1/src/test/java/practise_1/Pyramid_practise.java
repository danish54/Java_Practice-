package practise_1;

public class Pyramid_practise {

	public static void main(String[] args) {

		int row = 5;

		//for row
		for (int i = 0; i <= row; i++) {

			// for space
			for (int j = 0; j <= row - i; j++) {

				System.out.print(" ");
			}

			// for stars
			for (int k = 0; k <= i * 2; k++) {

				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
