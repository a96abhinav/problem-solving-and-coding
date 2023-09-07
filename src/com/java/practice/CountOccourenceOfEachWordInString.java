package com.java.practice;
import java.util.HashMap;

class HashMapPractice {
	
	public static HashMap<String,Integer> countEach(String s){
		String[] str = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String strng : str) {
			if(map.containsKey(strng)) {
				map.put(strng, map.get(strng)+1);
			}else {
				map.put(strng, 1);
			}
		}
		
		return map;
	}
	
}

public class CountOccourenceOfEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(HashMapPractice.countEach("My name is is is Abhinav Abhinav Gupta Java Java c c c"));
		
	}

}
