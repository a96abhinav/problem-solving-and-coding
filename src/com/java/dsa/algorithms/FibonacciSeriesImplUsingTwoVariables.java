package com.java.dsa.algorithms;

public class FibonacciSeriesImplUsingTwoVariables {

	public static void main(String[] args) {
		Long n = (long)50;
		printFibonacciSeries(n);
	}

	public static void printFibonacciSeries(Long n) {
		Long a = (long)0;
		Long b = (long)1;

		if (n >= 1) {
			System.out.print(a + " ");
		}
		if (n >= 2) {
			System.out.print(b + " ");
		}

		for (int i = 3; i <= n; i++) {
			System.out.print((a + b) + " ");
			b = a + b;
			a = b - a;
		}
	}

}
