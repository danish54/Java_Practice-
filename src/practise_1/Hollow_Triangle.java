package practise_1;

public class Hollow_Triangle {

	public static void main(String[] args) {
		
		int row=10;
		
		//for rows
		for(int i=0; i<=row; i++) {
			
			//for space
			for(int j=0; j<= row-i; j++) {
				
				System.out.print(" ");
			}
			
			//for star
			for(int k=0; k<= i*2; k++) {
				
				if(k==0 || k==i*2 || i==row) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//next line
			System.out.println("");
		}

	}

}
