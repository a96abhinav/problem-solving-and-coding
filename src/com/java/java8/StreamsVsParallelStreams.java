package com.java.java8;
import java.util.Arrays;
import java.util.List;

public class StreamsVsParallelStreams {

	public static void main(String[] args) {
		
		List<String> c = Arrays.asList("a","b","c","d","e","f","g","h","i");
		
		c.stream().forEach(System.out::println);
		System.out.println("---------");
		c.parallelStream().filter(cc->cc.contains("a") || cc.contains("b")).forEach(System.out::println);

	}

}
