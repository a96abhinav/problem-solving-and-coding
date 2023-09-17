package com.java.dsa;

public class MergeSortImpl {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 98, 32, 1, 7, -1, -3, 99, 200, 100, -300, 300 };

		divide(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void divide(int[] arr, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			divide(arr, low, mid);
			divide(arr, mid + 1, high);
			conquer(arr, low, mid, high);
		}

	}

	private static void conquer(int[] arr, int low, int mid, int high) {

		int[] merge = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= high) {
			if (arr[i] < arr[j]) {
				merge[k++] = arr[i++];
			}
			if (arr[j] < arr[i]) {
				merge[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			merge[k++] = arr[i++];
		}

		while (j <= high) {
			merge[k++] = arr[j++];
		}

		for (int l = 0, m = low; l < merge.length; l++, m++) {
			arr[m] = merge[l];
		}

	}

}
