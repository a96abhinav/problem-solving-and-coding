package com.java.java17;


sealed interface AA permits BB,A {
	
}

non-sealed interface BB extends AA{
	
}

sealed class A implements AA permits B {
	
}

non-sealed class B extends A{
	
}

class C extends B{
	
}

class D extends B{
	
}



public class SealedClassesInJava {
	public static void main(String[] args) {
		System.out.println("Intro to Sealed classes in java!");
	}
}
