package com.java.Practice;

public class Is_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Danish";
		
		
		boolean result = name.toLowerCase().matches(".*[aeiou].*");
		System.out.println(result);
		System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
	}

}
