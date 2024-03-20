package com.java.dsa.problems;

import java.util.*;

public class GFG {

	static List<String> al = new ArrayList<>();

	public static void printAllSubsequenceOfAString(String[] args) {
		String s = "Geeks";
		findsubsequences(s, "");
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.size());
	}

	private static void findsubsequences(String s, String ans) {
		if(s.length()==0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1),ans+s.charAt(0));
		findsubsequences(s.substring(1),ans);
	}
}