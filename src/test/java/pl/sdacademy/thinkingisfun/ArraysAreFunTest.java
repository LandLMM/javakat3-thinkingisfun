package pl.sdacademy.thinkingisfun;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysAreFunTest {

    private ArraysAreFun fun;

    @Before
    public void init() {
        fun = new ArraysAreFun();
    }

    @Test
    public void shouldMergeTwoArraysWithDistincts() {
        Integer[] first = {1,4,5,7};
        Integer[] second = {2,6,8,9};
        Integer[] expectedResult = {1,2,4,5,6,7,8,9};

        Integer[] result = fun.merge(first, second);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldMergeTwoArraysWithDuplicates() {
        Integer[] first = {1,4,5,7};
        Integer[] second = {4,5,6,7};
        Integer[] expectedResult = {1,4,4,5,5,6,7,7};

        Integer[] result = fun.merge(first, second);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldMergeTwoArraysWithDifferentLengths() {
        Integer[] first = {1,4,5,7};
        Integer[] second = {2,3,6,8,9,10};
        Integer[] expectedResult = {1,2,3,4,5,6,7,8,9,10};

        Integer[] result = fun.merge(first, second);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldMergeTwoArraysWithOneEmptyArray() {
        Integer[] first = {};
        Integer[] second = {1,2,3,4};
        Integer[] expectedResult = {1,2,3,4};

        Integer[] result = fun.merge(first, second);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldReverseOddLengthArray() {
        Integer[] array = {3,7,2,4,1};
        Integer[] expectedResult = {1,4,2,7,3};

        Integer[] result = fun.reverse(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldReverseEvenLengthArray() {
        Integer[] array = {8,6,7,2,6,4};
        Integer[] expectedResult = {4,6,2,7,6,8};

        Integer[] result = fun.reverse(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldReverseSingleValueArray() {
        Integer[] array = {5};
        Integer[] expectedResult = {5};

        Integer[] result = fun.reverse(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldReverseEmptyValueArray() {
        Integer[] array = {};
        Integer[] expectedResult = {};

        Integer[] result = fun.reverse(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldRollArrayBy1() {
        Integer[] array = {5,6,2,3,9,8,1};
        Integer[] expectedResult = {6,2,3,9,8,1,5};

        Integer[] result = fun.roll(array, 1);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldRollArrayBy3() {
        Integer[] array = {5,6,2,3,9,8,1};
        Integer[] expectedResult = {3,9,8,1,5,6,2};

        Integer[] result = fun.roll(array, 3);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldRollArrayByWholeLength() {
        Integer[] array = {5,6,2,3,9,8,1};
        Integer[] expectedResult = {5,6,2,3,9,8,1};

        Integer[] result = fun.roll(array, array.length);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldRollArrayBy0() {
        Integer[] array = {5,6,2,3,9,8,1};
        Integer[] expectedResult = {5,6,2,3,9,8,1};

        Integer[] result = fun.roll(array, 0);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldFindLongestGrowingTrent() {
        Integer[] array = {11,10,1,2,3,4,0};
        Integer[] expectedResult = {1,2,3,4};

        Integer[] result = fun.longestGrowingTrent(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldFindLongestGrowingTrent2() {
        Integer[] array = {11,10,1,2,3,4,0,7,8,9};
        Integer[] expectedResult = {1,2,3,4};

        Integer[] result = fun.longestGrowingTrent(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldFindFirstLongestGrowingTrend() {
        Integer[] array = {51,23,3,4,5,6,1,34,10,11,12,13};
        Integer[] expectedResult = {3,4,5,6};

        Integer[] result = fun.longestGrowingTrent(array);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void shouldFindGrowingTrendThatValuesAreNotIncreasingBy1() {
        Integer[] array = {17,21,13,19,25,78,129,128};
        Integer[] expectedResult = {13,19,25,78,129};

        Integer[] result = fun.longestGrowingTrent(array);

        assertArrayEquals(expectedResult, result);
    }

}