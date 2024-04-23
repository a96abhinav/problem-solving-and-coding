package com.java.practice;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    
    private static volatile Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exists");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance cannot be cloned");
    }

    // Prevent deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
