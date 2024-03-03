package com.java.practice;

import java.util.Arrays;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

	@Override
	public String toString() {
		return this.name;
	}
    
    
}

public class PersonArrayExample {
	/*
	 * public static void main(String[] args) { Person person1 = new
	 * Person("Person1", 20); Person person2 = new Person("Person2", 25); Person
	 * person3 = new Person("Person3", 35);
	 * 
	 * Person[] personsArray = { person1, person2, person3 };
	 * 
	 * for (int i = 0; i < personsArray.length; i++) { for (int j = 0; j <= i; j++)
	 * { System.out.print(personsArray[j].getName()+" "); }
	 * System.out.println(personsArray[i].getId()); } }
	 */
	
	public static void main(String[] args) {
        Person person1 = new Person("Person1", 20);
        Person person2 = new Person("Person2", 25);
        Person person3 = new Person("Person3", 35);

        Person[] personsArray = { person1, person2, person3 };
       
        for (int i = 0; i < personsArray.length; i++) {
            Person[] subarray = Arrays.copyOfRange(personsArray, 0, i + 1);
            System.out.print(Arrays.toString(subarray).replaceAll("[\\[\\],]", "")+" ");
            System.out.println(personsArray[i].getId());
        }
    }
}
