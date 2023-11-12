package com.java.java9;

interface A {
	public static int sum(int a,int b,int c) {
		System.out.println("Sum3 : "+sum3(a,b,c));
		return a+b;
	}
	private static int sum3(int a,int b,int c) {
		return a+b+c;
	}
}

public class PrivateMethodsInInterface implements A{

	public static void main(String[] args) {
		
		System.out.println(A.sum(2, 2,2));
		
	}
}
