package com.java.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Desc {
	String description;
}

@AllArgsConstructor
class Apple implements Runnable {

	Desc desc;

	@Override
	public void run() {
		synchronized (desc) {
			desc.setDescription("This is Apple!");
			desc.notify();
		}
	}
}

public class InterThreadCommunicationConcept02 {

	public static void main(String[] args) throws InterruptedException {
		Desc desc = new Desc("Please provide description!");
		Apple apple = new Apple(desc);
		new Thread(apple, "apple").start();
		
		synchronized (desc) {
			desc.wait();
		}

		System.out.println("Description : " + desc.getDescription());

	}
}