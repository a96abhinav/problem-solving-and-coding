package com.java.practice;

public class Enums {

    public enum Season {
        SUMMER(1), WINTER(2), SPRING(3), FALL(4);

        public int value;


        Season(int value) {
            this.value = value;
        }

    } //Enum is public static final by default

    public static void main(String[] args) {
        for (Enums.Season season : Enums.Season.values()) {
            System.out.println(season + " = " + season.value);
        }
    }
}
