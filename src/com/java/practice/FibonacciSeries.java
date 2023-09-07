package com.java.practice;

public class FibonacciSeries {

	// 0 1 1 2 3 5 8.....
	
	public static void main(String[] args) {
		
		int n=5;
		
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i = 1;i<5;i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
