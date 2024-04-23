package com.java.dsa.problems;
import java.util.Arrays;
import java.util.stream.Stream;

public class CartesianProduct {
    public static void main(String[] args) {
        String[] array1 = {"a", "b"};
        String[] array2 = {"1", "2", "3"};

        String[][] result = cartesianProduct(array1, array2);

        // Print the result
        Stream.of(result)
              .map(Arrays::toString)
              .forEach(System.out::println);
    }

    public static String[][] cartesianProduct(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                     .flatMap(item1 -> Arrays.stream(array2)
                                             .map(item2 -> new String[]{item1, item2}))
                     .toArray(String[][]::new);
    }
}
