package com.java.java9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImmutableCollection {
    public static void main(String[] args) {
        List list = List.of(2, 3, 4, 5, 6);
        Set set = Set.of(2, 3, 4, 5, 6, 7);
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");

        //list.add(23); we cannot modify immutable collection

        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list = " + list);

        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
