package com.java.Practice;

public class Count_word_in_string {

	public static void main(String[] args) {

		String str = "my name is danish";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' || i == str.length() - 1) {
				++count;
			}
		}

		System.out.println("count is: " + count);

	}

}
