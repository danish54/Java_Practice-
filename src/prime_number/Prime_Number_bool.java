package prime_number;

import java.util.Scanner;

public class Prime_Number_bool {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number here :");
		Boolean Prime = IsPrime(sc.nextInt());
		
		if(Prime == true) {
			System.out.println("Its a Prime Number");
		}
		else {
			System.out.println("Its not a Prime Number");	
		}
		
	}

	public static boolean IsPrime(int n) {
		if(n==1 || n==0 ) {
			return false;
		}
		for(int i=2; i<= n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
