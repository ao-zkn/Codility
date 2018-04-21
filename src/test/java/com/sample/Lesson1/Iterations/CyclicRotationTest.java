package com.sample.Lesson1.Iterations;

import com.sample.Lesson2.Arrays.CyclicRotation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @Before
    public void initialize() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void solutionTest001() {

        int[] A = {3, 8, 9, 7, 6};
        int K = 3;

        int[] result = {9, 7, 6, 3, 8};
        Assert.assertArrayEquals(result, cyclicRotation.solution1(A, K));
        Assert.assertArrayEquals(result, cyclicRotation.solution2(A, K));
    }

    @Test
    public void solutionTest002() {

        int[] A = {0, 0, 0};
        int K = 1;

        int[] result = {0, 0, 0};
        Assert.assertArrayEquals(result, cyclicRotation.solution1(A, K));
        Assert.assertArrayEquals(result, cyclicRotation.solution2(A, K));
    }

    @Test
    public void solutionTest003() {

        int[] A = {1, 2, 3, 4};
        int K = 4;

        int[] result = {1, 2, 3, 4};
        Assert.assertArrayEquals(result, cyclicRotation.solution1(A, K));
        Assert.assertArrayEquals(result, cyclicRotation.solution2(A, K));
    }

}
