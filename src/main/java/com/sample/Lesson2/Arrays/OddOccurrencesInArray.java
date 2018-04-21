package com.sample.Lesson2.Arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution1(int[] A) {

        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
            i = i + 1;
        }
        return A[A.length - 1];
    }

    public int solution2(int[] A) {

        Arrays.parallelSort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
            i = i + 1;
        }
        return A[A.length - 1];
    }

    public int solution3(int[] A) {

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;

    }

    // --- BAD -----------------------------------

    public int solution4(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return A[i];
            }
        }
        return A[0];
    }
}
