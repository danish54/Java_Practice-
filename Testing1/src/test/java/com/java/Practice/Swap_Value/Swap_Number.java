package com.java.Practice.Swap_Value;

public class Swap_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b= 30;
		
		System.out.println("a Before => "+a );
		System.out.println("b Before => "+b );
		
		b= a+b;
		a = b-a;
		b = b-a;

		System.out.println("a After => "+a );
		System.out.println("b After => "+b );
	}

}
