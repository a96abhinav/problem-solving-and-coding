package com.java.dsa.problems;

import lombok.NonNull;

public class ReverseCharactersInString {

	public static void main(String[] args) {
		
		System.out.println(reverseTwo("Abhinav"));

	}
	
	public static String reverseOne(@NonNull String string) {
		String str = "";
		for(int i = string.length()-1;i>=0;i--) {
			str+=string.charAt(i);
		}
		return str;
	}
	
	public static String reverseTwo(@NonNull String string) {
		String str = "";
		char[] ch = string.toCharArray();
		for(int i = string.length()-1;i>=0;i--) {
			str+=ch[i];
		}
		return str;
	}
}
