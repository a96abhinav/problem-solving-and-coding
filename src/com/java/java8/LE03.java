package com.java.java8;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LE03 {

	public static void main(String[] args) {
		
		Supplier<String> S = ()->"I am supplier";
		System.out.println(S.get());
		
		Consumer<Integer> c = (i)->System.out.println("Consumer-"+i);
		c.accept(55);

		Function<Integer, Integer> function = (i)->i*i;
		System.out.println(function.apply(3));
		
		Predicate<Integer> predicate = (i)->i%2==0;
		System.out.println(predicate.test(10));
	}
	
}
