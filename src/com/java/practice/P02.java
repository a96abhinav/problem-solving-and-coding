package com.java.practice;

public class P02 {

	static {
		System.out.println("I am static block");
	}

	public static void main(String[] args) {

		String s = "100";
		
		System.out.println(s+s);
		
		int i = Integer.parseInt(s);
		
		System.out.println(i+i);
		
		Integer i1 = Integer.valueOf(s);

		System.out.println(i1+i1);
		
		int i2 = i1.intValue();
		
		System.out.println(i2+i2);
	}

}
