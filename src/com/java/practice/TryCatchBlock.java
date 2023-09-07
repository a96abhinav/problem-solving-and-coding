package com.java.practice;

public class TryCatchBlock {

	public static void main(String[] args) {

		try {
			System.out.println("Abhinav Try before exc");
			int a = 2/0;
			System.out.println("Abhinav Try");
		} 
		catch(IndexOutOfBoundsException e) { System.out.println("Abhinav Try"); }

		finally{
			System.out.println("Abhinav finally");
		}
		System.out.println("Abhinav main");
	}

}
