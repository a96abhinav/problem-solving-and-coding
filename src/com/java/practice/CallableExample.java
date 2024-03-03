package com.java.practice;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool size of 1
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Create a Callable task
        Callable<String> callableTask = new MyCallable();

        // Submit the task to the ExecutorService and get a Future object
        Future<String> future = executorService.submit(callableTask);

        try {
            // Retrieve the result from the Future
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shutdown the ExecutorService
            executorService.shutdown();
        }
    }
}

// Implement the Callable interface with a specific type for the result
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        // Perform some task and return a result
        return "Hello from Callable!";
    }
}
