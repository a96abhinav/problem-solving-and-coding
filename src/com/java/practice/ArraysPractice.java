package com.java.practice;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
		
		String[] array = {"Apple","Banana","Orange","Watermelon"};	
		Arrays.fill(array, null);
		for(int i = 0;i<array.length;i++) {
			String[] subarray = Arrays.copyOfRange(array, 0, i+1);
			System.out.println(Arrays.toString(subarray).replaceAll("[\\[\\],]", "")+" "+(i+1));
		}

		
		
	}
}
