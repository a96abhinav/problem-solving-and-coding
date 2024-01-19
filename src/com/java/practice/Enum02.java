package com.java.practice;

enum Animal{
	Cow("cow, in common parlance, a domestic bovine, regardless of sex and age, usually of the species Bos taurus."),
	Tiger("The tiger (Panthera tigris) is the largest living cat species."),
	Lion("The lion (Panthera leo) is a large cat of the genus Panthera, native to Africa and India.");
	String description;
	Animal(String description){
		this.description = description;
	}
}

public class Enum02 {

	public static void main(String[] args) {
		
		//System.out.println(Animal.Cow.description);
		
		for(Animal animal : Animal.values()) {
			System.out.println(animal +" : "+animal.description);
		}
		
	}

}
