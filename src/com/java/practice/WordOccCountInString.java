package com.java.practice;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordOccCountInString {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,3);
		HashSet<Integer> uniqueList = new HashSet<Integer>();
		
		
		integerList.stream().forEach(value ->{
			uniqueList.add(value);
		});
		
		System.out.println(uniqueList);
		
		String str= "Black cat white cat";
		
		
		List<String> wordsList = Arrays.asList(str.split(" "));
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
		
		wordsList.stream().forEach(strValue ->{
			if(wordsCount.get(strValue) != null) {
				wordsCount.put(strValue, wordsCount.get(strValue)+1);
			}else {
				wordsCount.put(strValue, 1);
			}
		});
		
		System.out.println(wordsCount);
		
		
		//output: Black=1 white=1 cat =2
		
		
	}

}
