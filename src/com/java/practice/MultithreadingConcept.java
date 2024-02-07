package com.java.practice;

public class MultithreadingConcept {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.out.println("Getting into deadlock condition...");
		 * Thread.currentThread().join();
		 */
		System.out.println(Thread.currentThread().getName());

		Thread t0 = new Thread(() -> {
			int total = 0;
			for (int i = 0; i < 10; i++) {
				System.out.println("Total_0 :" + (total += i));
			}
		});

		Thread t1 = new Thread(() -> {
			int total = 0;
			for (int i = 0; i < 10; i++) {
				System.out.println("Total_1 :" + (total += i));
			}
		});

		t0.start();
		t0.join();
		t1.start();

	}

}
