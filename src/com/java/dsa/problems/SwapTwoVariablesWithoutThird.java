package com.java.dsa.problems;

public class SwapTwoVariablesWithoutThird {

	public static void main(String[] args) {
		
		int x = 28;
		int y = 59;
		System.out.println("value of x & y before swapping is : "+x+" & "+y);
		x = x+y; //100
		y = x-y;//30
		x = x-y;//70
		System.out.println("value of x & y after swapping is : "+x+" & "+y);
	}

}
