package com.java.practice;

class AgeException extends RuntimeException{
	AgeException(String message){
		super(message);
	}
}
public class CustomException {

	public static void main(String[] args) {
		throw new AgeException("Age is less than 18 years");
	}

}
