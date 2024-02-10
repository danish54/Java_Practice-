package pattern;

public class Diamond_Shape_Pattern {

/*
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     * 
*/
	public static void main(String[] args) {

		int i, j, row = 5;

		// loop for outer row
		for (i = 0; i <= row; i++) {

			// loop for star
			for (j = 1; j <= row - i; j++) {

				System.out.print(" ");
			}

			for (j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}

			// this will bring cursor to next line
			System.out.println("");
		}
		
		for(i=0; i<=row-1; i++) {
			
			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			
			for(j=0; j<=2*(row-1-i); j++)
				System.out.print("*");
			
			System.out.println("");
		}
	}

}
