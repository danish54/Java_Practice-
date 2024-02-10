package com.java.Practice;

import java.util.Scanner;

public class Add_Num {

	public static void main(String[] args) {

		int x, y, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		x = sc.nextInt();

		System.out.println("Enter Second Number :");
		y = sc.nextInt();
		sc.close();

		sum = Summ(x, y);

		System.out.println("Sum of these two Numbers is:" + sum);

	}

	public static int Summ(int a, int b) {
		int total = a + b;

		return total;

	}

}
