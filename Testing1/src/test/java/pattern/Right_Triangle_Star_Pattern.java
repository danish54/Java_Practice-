package pattern;

public class Right_Triangle_Star_Pattern {

	public static void main(String[] args) {
		int i, j, row = 5;

		//loop for outer row
		for (i = 0; i <= row; i++) {

			//loop for star
			for (j = 1; j <=row-i; j++) {

				System.out.print("*");

			}
			
			//this will bring cursor to next line
			System.out.println("");
		}


	}

}
