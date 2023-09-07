package com.java.java8;
interface Interf02 {
		public int m1(int a,int b);
	}

public class LE02 {

	
	
	public static void main(String[] args) {
		
		Interf02 i = (a,b) -> (a+b);
		System.out.println(i.m1(2,2));

	}

}
