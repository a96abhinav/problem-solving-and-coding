package com.java.java21;

record Person(String name, int age) {}

public class RecordPatternExample {
    public static void main(String[] args) {
        Object obj = new Person("Alice", 25);
        if (obj instanceof Person(String name, int age)) { // Decomposing directly
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}