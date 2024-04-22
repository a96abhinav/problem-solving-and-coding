package com.java.dsa.algorithms;

public class InsertionSortImpl {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 98, 32, 1, 0 }; // 5,2,8,98,32,32

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
