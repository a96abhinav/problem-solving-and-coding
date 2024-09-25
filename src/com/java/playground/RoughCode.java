package com.java.playground;

public class RoughCode {

    public static void main(String[] args) {

        int x =245;
        int y =354;
        System.out.println("Before swap x - "+x+" & y - "+y);
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After swap x - "+x+" & y - "+y);
    }
}
