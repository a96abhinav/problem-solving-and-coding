package com.java.practice;

class Test implements Cloneable{
	int a= 22;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Clone Successful!");
		return super.clone();
	}
}

public class CloneableInterface {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test test = new Test();
		Test test2 = (Test)test.clone();
		 
		
		System.out.println(test2.a);

	}

}
