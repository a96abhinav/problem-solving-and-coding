package com.java.dsa;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearchingAlgorithmImpl {
    static List<Integer> searchPattern(char[] pat, char[] txt) {
        int patLength = pat.length;
        int txtLength = txt.length;
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i <= txtLength - patLength; i++) {
            Integer count = 0;
            for (int j = 0; j < patLength; j++) {
                if (txt[i + j] == pat[j]) {
                    count++;
                }
            }
            if (count == patLength) {
                indexList.add(i);
            }
        }
        return indexList;
    }

    public static void main(String[] args) {
        char txt[] = "ABABABABABABABABABABAB".toCharArray();

        char pat[] = "AB".toCharArray();

        System.out.println(searchPattern(pat, txt));
    }
}
