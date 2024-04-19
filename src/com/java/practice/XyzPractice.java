package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XyzPractice {

	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Map<Integer, Integer> consecutiveOddEvenMap = IntStream.range(0, array.length).boxed()
                .filter(i -> array[i] % 2 != 0).collect(Collectors.toMap(i -> array[i], i -> array[i + 1]));

        // Print the map
        consecutiveOddEvenMap.forEach((key, value) -> System.out.println(key + " -> " + value));
        
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,1,22);
        //list.stream().p
        
        //System.out.println(Math.random()*10+());
        
        System.out.println(list.stream().collect(Collectors.summingInt(i->i)));
        
	}
}
