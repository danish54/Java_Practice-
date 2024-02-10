package com.java.Practice;

import java.util.Scanner;

public class Reverse_Using_StringBuilder {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

         Scanner  sc = new Scanner(System.in);
        
        System.out.println("Enter String!");
        String name = sc.nextLine();
        
        if(name == null) {
        	throw new NullPointerException("Name is Null");
        }
        	
        StringBuilder Builder = new StringBuilder(name);
        
        Builder.reverse();
        
        System.out.println(Builder);
        
        sc.close();
	}

}
