package com.java.dsa.algorithms;

import java.util.Arrays;
import java.util.Comparator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Item {
	int value, weight;
}

class MyRatioComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		double r1 = (double) o1.value / (double) o1.weight;
		double r2 = (double) o2.value / (double) o2.weight;
		if (r1 < r2) {
			return 1;
		} else if (r1 > r2) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class FractionalKnapsackProblem {

	public static void main(String[] args) {
		int n = 10;
		int w = 21;
		Item[] arr = { new Item(8, 10), new Item(2, 1), new Item(10, 7), new Item(1, 7), new Item(9, 5), new Item(7, 1),
				new Item(2, 8), new Item(6, 6), new Item(4, 8), new Item(9, 7) };

		int n2 = 3;
		int w2 = 50;
		Item[] arr2 = { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
		System.out.println(fractionalKnapsack(w2, arr2, n2));
		System.out.println(fractionalKnapsack(w, arr, n));
	}

	private static double fractionalKnapsack(int W, Item arr[], int n) {
		double totalW = 0;
		double totalV = 0;

		Arrays.sort(arr, new MyRatioComparator());

		for (int i = 0; i < arr.length; i++) {
			if (totalW == W) {
				// System.out.println("----"+totalW+","+totalV);
				break;
			} else if (totalW + arr[i].weight > W) {

				totalV = totalV + ((W - totalW) * ((double) arr[i].value) / (double) arr[i].weight);
				totalW = W;
				// System.out.println(totalW+","+totalV);

			} else {
				totalW = totalW + arr[i].weight;
				totalV = totalV + arr[i].value;
				// System.out.println(totalW+","+totalV);
			}
		}

		return totalV;
	}

}
