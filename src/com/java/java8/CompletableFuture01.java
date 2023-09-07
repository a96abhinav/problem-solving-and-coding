package com.java.java8;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFuture01 {
	public static void main(String[] args) {
		try {
			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
			list.stream().map(num -> CompletableFuture.supplyAsync(() -> num*num))
					.map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n)).map(t -> t.join())
					.forEach(s -> System.out.println(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}