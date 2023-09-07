package com.java.practice;

class A{
	int a;
	public A() {
		System.out.println("I am class A");
		this.a = 10;
	}
}

class B extends A{
	int a;
	public B() {
		System.out.println("I am class B");
		this.a = 20;
	}
}

class C extends B{
	int a;
	public C() {
		System.out.println("I am class C");
		this.a = 30;
	}
}

class D extends C{
	//int a;
	public D() {
		System.out.println("I am class D");
		this.a = 40;
	}
}

public class Inheritence extends D {
	int a;
	public Inheritence() {
		System.out.println("I am class Inheritence");
		a = 50;
	}
	public static void main(String[] args) {

		D a = new Inheritence();
		
		System.out.println("a = "+a.a);
		
	}

}
