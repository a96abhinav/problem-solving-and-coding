package com.java.java8;
interface Interf {
		public void m1();
	}

public class LE01 {

	
	
	public static void main(String[] args) {
		
		Interf i = () -> System.out.println("Lambda expression example");
		i.m1();

	}

}
