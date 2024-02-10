package com.java.Practice;

import java.util.Scanner;

public class reverse_using_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String name = sc.nextLine();
		String Reversedname = "";
		
		for(int i = 0; i<name.length(); i++) {
			
		Reversedname = name.charAt(i)+Reversedname;
	    
		}  
		System.out.println(Reversedname);
	}

}
