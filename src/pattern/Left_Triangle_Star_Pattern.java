package pattern;

public class Left_Triangle_Star_Pattern {

	public static void main(String[] args) {

		int i, j, row = 5;

		//loop for outer row
		for (i = 0; i <= row; i++) {

			//loop for space
			for (j = row - i; j >= 0; j--) {

				System.out.print(" ");

			}
			//loop for star
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			//this will bring cursor to next line
			System.out.println("");
		}

	}

}
