package com.java.practice;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        // Create a thread pool with 1 thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Define a Callable task
        Callable<String> task = () -> {
            Thread.sleep(2000);  // Simulate a long-running task
            return "Hello from Callable!";
        };

        // Submit the Callable task for execution and get a Future
        Future<String> future = executorService.submit(task);

        // Perform other operations while the task is running

        // Wait for the task to complete and retrieve the result
        String result = future.get();
        System.out.println(result);  // Output: Hello from Callable!

        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}
