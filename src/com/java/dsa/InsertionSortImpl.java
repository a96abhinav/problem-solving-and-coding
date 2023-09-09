package com.java.dsa;

public class InsertionSortImpl {
	public static void main(String[] args) {
		
		int[] arr = {5,2,8,98,32,1,0}; // 5,2,8,98,32,32
		
		for(int i = 0;i<arr.length-1;i++) {
			int ele = arr[i+1];
			int index = i+1;
			for(int j = i;j>=0;j--) {			
				if(ele<arr[j]) {
					arr[j+1]=arr[j];
					index = j;
				}
			}
			arr[index]=ele;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
