package com.java.dsa.algorithms;

public class BinarySearchImpl {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		int valueToSearch = 5;

		int searchIndex = binarySearch(arr, 0, arr.length - 1, valueToSearch);
		if (searchIndex == -1) {
			System.out.println(valueToSearch + " not found");
		} else {
			System.out.println(valueToSearch + " found at index " + searchIndex);
		}
	}

//    public static int binarySearch(int[] arr, int low, int high, int valueToSearch) {
//        int index = -1;
//        if (low <= high) {
//            int mid = (low + high) / 2;
//            if (arr[mid] == valueToSearch) {
//                index = mid;
//            } else if (valueToSearch < arr[mid]) {
//                index = binarySearch(arr, low, mid - 1, valueToSearch);
//            } else if (valueToSearch > arr[mid]) {
//                index = binarySearch(arr, mid + 1, high, valueToSearch);
//            }
//        }
//        return index;
//    }

	public static int binarySearch(int[] arr, int low, int high, int valueToSearch) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == valueToSearch) {
				return mid;
			} else if (valueToSearch < arr[mid]) {
				end = mid - 1;
			} else if (valueToSearch > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}
}
