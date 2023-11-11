package com.java.dsa;

public class LinearSearchImpl {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 8, 9, 12, 45};
        int valueToSearch = 45;
        int searchIndex = linearSearch(arr, valueToSearch);
        if (searchIndex == -1) {
            System.out.println(valueToSearch + " not found");
        } else {
            System.out.println(valueToSearch + " found at index " + searchIndex);
        }
    }

    public static int linearSearch(int[] arr, int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                return i;
            }
        }
        return -1;
    }
}

