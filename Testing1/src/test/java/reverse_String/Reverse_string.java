package reverse_String;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sting here:");
		String name = sc.nextLine();
		
		int size = name.length();
		
		String reverse = ""; 
		
		for(int i=0; i<size; i++) {
				
			reverse = name.charAt(i)+reverse;
			
		}
		
		System.out.println(reverse);
		
	}

}
