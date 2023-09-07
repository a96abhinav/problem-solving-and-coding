package com.java.java8;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture02 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<Integer> future01 = CompletableFuture.supplyAsync(()-> {
			try {
				return getSquare01(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		});
		CompletableFuture<Integer> future02 = CompletableFuture.supplyAsync(()-> {
			try {
				return getSquare02(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		});
		CompletableFuture<Integer> future03 = CompletableFuture.supplyAsync(()-> {
			try {
				return getSquare03(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		});
		CompletableFuture.allOf(future01,future02,future03).join(); 
		
		System.out.println(future01.get());
		System.out.println(future02.get());
		System.out.println(future03.get());
	}
	
	public static Integer getSquare01(Integer n) throws InterruptedException {
		Thread.sleep(2000);
		return n*n;
	}
	
	public static Integer getSquare02(Integer n) throws InterruptedException {
		Thread.sleep(4000);
		return n*n;
	}
	
	public static Integer getSquare03(Integer n) throws InterruptedException {
		Thread.sleep(6000);
		return n*n;
	}
}