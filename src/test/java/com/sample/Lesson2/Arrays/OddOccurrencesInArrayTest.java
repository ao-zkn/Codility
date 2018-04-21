package com.sample.Lesson2.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddOccurrencesInArrayTest {


    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void initialize() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }


    @Test
    public void solutionTest001() {

        int[] A = {9, 3, 9, 3, 9, 7, 9};

        int result = 7;
        Assert.assertEquals(result, oddOccurrencesInArray.solution1(A));
        Assert.assertEquals(result, oddOccurrencesInArray.solution2(A));
        Assert.assertEquals(result, oddOccurrencesInArray.solution3(A));
        Assert.assertEquals(result, oddOccurrencesInArray.solution4(A));

    }

}
