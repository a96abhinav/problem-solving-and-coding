package com.java.java9;

public class ProcessAPI {
    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " + currentProcess.pid());
    }
}
