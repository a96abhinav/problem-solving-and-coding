package com.java.dsa.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 1, 3, 2); // 6,12,4,6

		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < list1.size(); i++) {

			int product = 1;

			for (int j = 0; j < list1.size(); j++) {
				if (i != j) {
					product *= list1.get(j);
				}

			}

			list2.add(product);

		}
		
		System.out.println(list2);

	}
}
