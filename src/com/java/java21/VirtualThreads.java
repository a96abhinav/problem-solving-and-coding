package com.java.java21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class VirtualThreads {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

			List<Callable<String>> tasks = new ArrayList<>();

			Callable<String> task1 = () -> "Task 1";
			Callable<String> task2 = () -> "Task 2";
			Callable<String> task3 = () -> "Task 3";
			Callable<String> task4 = () -> "Task 4";

			tasks.add(task1);
			tasks.add(task2);
			tasks.add(task3);
			tasks.add(task4);

			List<Future<String>> results = executorService.invokeAll(tasks);

			for (Future<String> result : results) {
				System.out.println(result.get());
			}
		}

	}
}
