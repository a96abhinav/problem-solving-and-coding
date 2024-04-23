package com.java.dsa.problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 1, 3, 2); // 6,12,4,6

		List<Integer> list2 = new ArrayList<Integer>();

		Integer multipleOfAllNumbers = list1.stream().reduce(1, (a,b)->a*b);
		
		list1.forEach(e->{
			list2.add(multipleOfAllNumbers/e);
		});
		
		System.out.println(list2);
	}
}
