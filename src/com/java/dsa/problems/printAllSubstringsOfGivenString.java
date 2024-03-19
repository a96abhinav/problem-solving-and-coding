package com.java.dsa.problems;

public class printAllSubstringsOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		substrings("abcd");
	}
	
	public static void substrings(String s) {
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				
				System.out.println(s.substring(i, j));
				
			}
		}
		
	}

}
