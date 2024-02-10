package com.java.Practice;

import java.util.Scanner;

public class Is_vowel_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.nextLine();

		System.out.println(IsVowelPresent(name));

	}

	static boolean IsVowelPresent(String name) {
		return name.toLowerCase().matches(".*[aeiou].*");
	}

}
