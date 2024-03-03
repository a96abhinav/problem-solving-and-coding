package com.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsProblems {

	public static void main(String[] args) {

		//*********** Seperate odd and even numbers
		System.out.println("P1*******************************************************************************");
		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 44, 31, 67, 87, 97);
		Map<Boolean, List<Integer>> oddAndEvenNumbersMap = listOfIntegers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		for (Map.Entry<Boolean, List<Integer>> map : oddAndEvenNumbersMap.entrySet()) {
			if (map.getKey()) {
				System.out.println("Even Numbers :");
			} else {
				System.out.println("Odd Numbers :");
			}
			map.getValue().forEach(i -> System.out.print(i + " "));
			System.out.println();
		}

		//************* Frequency of each character in a String
		System.out.println("P2*******************************************************************************");
		
		String desc = "We live in a beautiful World!";
		Map<Character, Long> countCharOccourence = desc.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countCharOccourence);
		
		//************* Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter
		System.out.println("P3*******************************************************************************");
		
		List<String> listOfCompanies = Arrays.asList("Facebook","Google","Yahoo","Oracle","Deloitte");
		String combinedString = listOfCompanies.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(combinedString);
		
		//*************** Given a list of integers, find maximum and minimum of those numbers
		System.out.println("P4*******************************************************************************");
		
		//int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get(); 
		//int max = Collections.max(listOfIntegers);
		int max = listOfIntegers.stream().mapToInt(i->i).max().getAsInt();
		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("max : "+max+" & min : "+min);
		
		//*************** How do you merge two unsorted arrays into single sorted array using Java 8 streams
		System.out.println("P5*******************************************************************************");
		int[] a = new int[] {2,3,4,56,6,8};
		int[] b = new int[] {34,65,87,93,45,64,28};
		
		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(c));
		
		//*************** Java 8 program to check if two strings are anagrams or not
		System.out.println("P6*******************************************************************************");
		String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());        
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());         
        String result = s1.equals(s2) ? "Two strings are anagrams":"Two strings are not anagrams";
        System.out.println(result);
        
        //***************  Find sum of all digits of a number in Java 8
        System.out.println("P7*******************************************************************************");
        int number = 123456789;
        Integer sumOfNumber = Arrays.asList(String.valueOf(number).split("")).stream().collect(Collectors.summingInt(Integer :: parseInt));
        System.out.println(sumOfNumber);
        
        //***************  Join the characters and convert to String using Java 8
        System.out.println("P8*******************************************************************************");        
        List<String> str = Arrays.asList("A","B","H","I","N","A","V");        
        String s = str.stream().map(String :: toLowerCase).collect(Collectors.joining());
        System.out.println(s);
        
        //***************   Given a list of strings, sort them according to increasing order of their length
        System.out.println("P9*******************************************************************************"); 
        List<String> listOfFruits = Arrays.asList("Apple","Mango","Banana","Watermelon","Guava","Orange","Pineapple");
        listOfFruits = listOfFruits.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
        System.out.println(listOfFruits);
        
        //***************   Reverse each word of a string using Java 8 streams
        System.out.println("P10*******************************************************************************");
        String reverseTheString = "I love my India";        
        reverseTheString = Arrays.asList(reverseTheString.split(" ")).stream().map(ss-> new StringBuffer(ss).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverseTheString);       
	
        //***************   How do you find sum of first 10 natural numbers
        System.out.println("P11*******************************************************************************");
        System.out.println(IntStream.rangeClosed(1, 10).sum());
        
        //***************   Find the 3rd largest number from given list of numbers
        System.out.println("P12*******************************************************************************");
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(2).max(Comparator.naturalOrder()).get());
        
     	//***************   Extract duplicate characters from string
        System.out.println("P13*******************************************************************************");
        String strWithDuplicates = "aabbhhiinnaavvxyz";
        Set<String> uniqueChars = new HashSet<String>();
        Set<String> duplicateChars = Arrays.asList(strWithDuplicates.split("")).stream().filter(ch-> uniqueChars.add(ch)==false).collect(Collectors.toSet());
        System.out.println("duplicateChars : "+duplicateChars);
        System.out.println("uniqueChars : "+uniqueChars);
        
        //***************   Check for pallindrome
        System.out.println("P14*******************************************************************************");
        
        String str1 = "ROTATOR";
        //boolean isItPalindrome = IntStream.range(0, str.length()/2).
        //noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));
        boolean isPalindrome = IntStream.range(0, str1.length()/2).noneMatch(i -> str1.charAt(i) != str1.charAt(str1.length()-i-1));
        System.out.println(isPalindrome);
	}

	public static String resverse(String string) {
		String s = "";
		for(int i=string.length()-1;i>=0;i--) {
			s+=string.charAt(i);
		}
		return s;
	}
}
