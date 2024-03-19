package com.java.practice;

import java.util.WeakHashMap;

public class XyzPractice {

	public static void main(String[] args) {

		/*
		 * String one = "1"; String two = "2";
		 */

		String one = new String("1");
		String two = new String("2");

		WeakHashMap<String, Integer> whm = new WeakHashMap<String, Integer>();
		whm.put(one, 1);
		whm.put(two, 2);
		System.out.println(whm);

		one = null;
		System.gc();
		System.out.println(whm);

	}
}
