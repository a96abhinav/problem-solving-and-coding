package com.java.dsa.problems;

public class StringCompressionProblem {

	public static void main(String[] args) {

		String str = "aaabbccddaabb"; // ->a3b2c2d2a2b2

		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			} else {
				sb.append(str.charAt(i));
				sb.append(count);
				count = 1;
			}
		}
		System.out.println(sb);

	}

}
