package com.java.dsa.problems;

public class printAllSubstringsOfGivenString {

	public static void main(String[] args) {

		substrings("geeksforgeeks");
		System.out.println("=======================");
		substringsNew("geeksforgeeks");
	}

	public static void substrings(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {

				if (s.substring(i, j).length() == 3) {
					System.out.println(s.substring(i, j));
				}

			}
		}
	}

	public static void substringsNew(String s) {

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sub = "";
				for (int m = i; m <= j; m++) {
					sub = sub + s.charAt(m);
				}
				if (sub.length() == 3) {
					System.out.println(sub);
				}
			}
		}
	}

}
