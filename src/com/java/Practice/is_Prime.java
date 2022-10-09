package com.java.Practice;

public class is_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 17;
		
		for(int n=1; n<=num; n++) {
			if(num%n != 0) {
				
				System.out.println(num + "is a prime number!");
			
			}
			else 
				System.out.println(num + "is not a prime number!");
		}
		
		
		
	}

}
