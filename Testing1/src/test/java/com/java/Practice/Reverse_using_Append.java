package com.java.Practice;

import java.util.Scanner;

public class Reverse_using_Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =new Scanner(System.in);
		
		StringBuffer Str= new StringBuffer();
		System.out.println("Enter name here :");
		char[] name = sc.nextLine().toCharArray();
		System.out.println(name);
		
		for(int i =name.length-1; i>0; i--) {
			
			Str= Str.append(name[i]);
		}
	
		System.out.println(Str);
		
	}

}
