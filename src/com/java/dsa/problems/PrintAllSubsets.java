package com.java.dsa.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsets {

	public static void findAllSubsets(List<Integer> list, List<List<Integer>> result, List<Integer> subset, int index) {
		result.add(new ArrayList<Integer>(subset));
		for(int i = index;i<list.size();i++) {
			subset.add(list.get(i));
			findAllSubsets(list, result, subset, i+1);
			subset.remove(subset.size()-1);
		}
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3);
		List<Integer> subset = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		findAllSubsets(list, result, subset, 0);
		// calcSubset(list, result, subset, 0);

		System.out.println(result);
	}
}