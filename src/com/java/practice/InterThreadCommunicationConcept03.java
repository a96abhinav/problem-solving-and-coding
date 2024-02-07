package com.java.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class CalculateTotal {
	int total;
}

@AllArgsConstructor
class Sum implements Runnable {

	CalculateTotal calculateTotal;

	@Override
	public void run() {
		synchronized (calculateTotal) {
			for (int i = 0; i < 10; i++) {
				calculateTotal.setTotal(calculateTotal.getTotal() + i);
			}
			calculateTotal.notify();
		}
	}
}

public class InterThreadCommunicationConcept03 {

	public static void main(String[] args) throws InterruptedException {
		CalculateTotal calculateTotal = new CalculateTotal(0);
		Sum sum = new Sum(calculateTotal);
		new Thread(sum, "sum").start();

		synchronized (calculateTotal) {
			calculateTotal.wait();
		}

		System.out.println("Total Sum : " + calculateTotal.getTotal());

	}
}