package com.java.Practice;

public class ClassAB implements ClassA, ClassB {

	public static void main(String[] args) {
		
		ClassAB obj = new ClassAB();
		obj.carA();
		obj.carB();
		
	}

	@Override
	public void carB() {
		System.out.println("CarB ClassB");
		
	}

	@Override
	public void carA() {
		System.out.println("CarA CalssA");
		
	}

}
