package com.java.java9;

interface A {

	int multiply(int a, int b);

	default int divide(int a, int b) {
		return a / b;
	}

	public static int sum(int a, int b, int c) {
		return sum3(a, b, c);
	}

	private static int sum3(int a, int b, int c) {
		return a + b + c;
	}
}

public class PrivateMethodsInInterface implements A {

	public static void main(String[] args) {

		PrivateMethodsInInterface privateMethodsInInterface = new PrivateMethodsInInterface();
		System.out.println(privateMethodsInInterface.multiply(2, 2)); //abstract method
		System.out.println(privateMethodsInInterface.divide(2, 2)); //default method
		System.out.println(A.sum(2, 2, 2)); //static method
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}
}
