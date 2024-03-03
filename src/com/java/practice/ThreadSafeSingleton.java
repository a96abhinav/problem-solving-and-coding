package com.java.practice;
public class ThreadSafeSingleton {
    // Creating private instance to make it accessible only by getInstance() method
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){
      // Making constructor private so that objects cant be initialized outside the class
    }
    public static ThreadSafeSingleton getInstance(){
      if (instance == null){
        //synchronized block of code
        synchronized (ThreadSafeSingleton.class){
          if(instance==null)
          {
            // initialize only if instance is null
            instance = new ThreadSafeSingleton();
          }
        }
      }
      return instance;
    }
   }