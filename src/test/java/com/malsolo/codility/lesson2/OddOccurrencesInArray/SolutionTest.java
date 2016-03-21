package com.malsolo.codility.lesson2.OddOccurrencesInArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() throws Exception {
        int[] givenArray = { 9, 3, 9, 3, 9, 7, 9 };
        int expected = 7;
        assertEquals(expected, solution.solution(givenArray));
    }
}
