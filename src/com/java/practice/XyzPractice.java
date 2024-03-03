package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface AA {

}

interface BB {

}

interface CC {

}

public class XyzPractice implements AA, BB, CC {

	int id;

	public static void main(String[] args) {

		double a= 10;
		double b = 7;
		
		System.out.println(a/b);
	}

}
