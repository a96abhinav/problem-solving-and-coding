package com.java.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorInJava8 {

	public static void main(String[] args) {

		List<String> fruitList = Arrays.asList("Apple", "Mango", "Orange", "Guava", "Papaya", "Watermelon", "Banana",
				"Grapes");

		Spliterator<String> spliterator1 = fruitList.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		Spliterator<String> spliterator3 = spliterator1.trySplit();

		System.out.println("------------------spliterator1------------------");
		spliterator1.forEachRemaining(System.out::println);
		System.out.println("------------------spliterator2------------------");
		spliterator2.forEachRemaining(System.out::println);
		System.out.println("------------------spliterator3------------------");
		spliterator3.forEachRemaining(System.out::println);

	}

}
