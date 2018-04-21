package com.sample.Lesson2.Arrays;

import java.util.stream.IntStream;

/**
 * @author masato_arihara
 */
public class CyclicRotation {

    public int[] solution1(int[] A, int K) {

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[(i + K) % A.length] = A[i];
        }

        return B;
    }

    public int[] solution2(int[] A, int K) {

        int[] B = new int[A.length];
        IntStream.range(0, A.length)
                .forEach(i -> B[(i + K) % A.length] = A[i]);
        return B;
    }
}
