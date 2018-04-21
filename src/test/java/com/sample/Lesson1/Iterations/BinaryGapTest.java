package com.sample.Lesson1.Iterations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author masato_arihara
 */
public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void initialize() {
        binaryGap = new BinaryGap();
    }

    @Test
    public void solutionTest001() {

        int N = 1041;

        int result = 5;
        Assert.assertEquals(result, binaryGap.solution1(N));
        Assert.assertEquals(result, binaryGap.solution2(N));
        Assert.assertEquals(result, binaryGap.solution3(N));
    }

    @Test
    public void solutionTest002() {

        int N = 5;

        int result = 1;
        Assert.assertEquals(result, binaryGap.solution1(N));
        Assert.assertEquals(result, binaryGap.solution2(N));
        Assert.assertEquals(result, binaryGap.solution3(N));
    }

    @Test
    public void solutionTest003() {

        int N = 1610612737;

        int result = 28;
        Assert.assertEquals(result, binaryGap.solution1(N));
        Assert.assertEquals(result, binaryGap.solution2(N));
        Assert.assertEquals(result, binaryGap.solution3(N));
    }
}
