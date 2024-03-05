package com.java.dsa.problems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccCountInString {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,3);
		HashSet<Integer> uniqueList = new HashSet<Integer>();
		
		
		integerList.stream().forEach(value ->{
			uniqueList.add(value);
		});
		
		System.out.println(uniqueList);
		
		String str= "Black cat white cat";
		
		Map<String,Long> wordCount = Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordCount);		
	}

}
