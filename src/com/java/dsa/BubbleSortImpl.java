package com.java.dsa;

import java.time.Duration;
import java.time.Instant;

public class BubbleSortImpl {

	public static void main(String[] args) {

		int[] arr = new int[1000];
		/*
		 * for (int i = 999; i >= 0; i--) { arr[i] = 999 - i; }
		 */

		for (int i = 0; i < 1000; i++) {
			arr[i] = i;
		}

		// BubbleSort logic starts
		boolean swapped;
		Instant start = Instant.now();
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		// BubbleSort logic ends

		//System.out.println("Time taken 1: " + Duration.between(start, Instant.now()).toNanos());
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
