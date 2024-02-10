package com.java.Practice;

public class PractiseReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "danish";
		String rev = "";
		
		for (int i=0; i<str.length(); i++) {
			
			rev= str.charAt(i)+rev;
		}
		
		System.out.println(rev);
	}

}
