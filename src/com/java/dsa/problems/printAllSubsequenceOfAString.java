package com.java.dsa.problems;

import java.util.*;
import java.util.stream.Collectors;

public class printAllSubsequenceOfAString {

	static List<String> al = new ArrayList<>();
	static TreeSet<String> al2 = new TreeSet<>();

	public static void main(String[] args) {
		String s = "aab";
		findsubsequences(s, "");
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.size());
		
		al.forEach(i->{
			if(!i.isEmpty()) {
				if(isVowel(i.charAt(0))) {
					if(isConsonant(i.charAt(i.length()-1))) {
						al2.add(i);
					}	
				}			
			}
		});
		
		System.out.println(al2);
		
	}

	private static void findsubsequences(String s, String ans) {
		if (s.length() == 0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));
		findsubsequences(s.substring(1), ans);
	}

	static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

	// Check if char c is consonant or not
	static boolean isConsonant(char c) {
		return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
}