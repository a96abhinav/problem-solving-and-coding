package com.java.practice;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
		Set<String> set = new java.util.HashSet<String>();
		
		set.add("Abhinav");
		set.add("Alok");
		set.add("Gaurav");
		set.add("Ujjwal");
		set.add("Abhay");
		set.add("Akshay");
		
		System.out.println(set);
		
		 

	}
	
	public int hashcode() {
		return 1;
		
	}

}

//[Akshay, Alok, Gaurav, Abhinav, Abhay, Ujjwal]