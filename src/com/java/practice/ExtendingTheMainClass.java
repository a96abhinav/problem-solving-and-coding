package com.java.practice;

public class ExtendingTheMainClass extends Thread {

	public void run() {
		int n=100;
		while(n>0) {
			System.out.println("I am Thread!");
			n--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingTheMainClass s = new ExtendingTheMainClass();	
		s.start();
		int n=100;
		while(n>0) {
			System.out.println("I am Main!");
			n--;
		}
	}

}
