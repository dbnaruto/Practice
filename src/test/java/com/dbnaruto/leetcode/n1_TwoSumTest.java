package test.java.com.dbnaruto.leetcode;

import main.java.com.dbnaruto.leetcode.*;
import org.junit.jupiter.api.Assertions;

class n1_TwoSumTest {

    @org.junit.jupiter.api.Test
    void testContainsDuplicate() {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = n1_TwoSum.twoSum(nums, target);
        int[] expected = {0,1};
        Assertions.assertArrayEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void testContainsDuplicate_2() {

        int[] nums = {3,2,4};
        int target = 6;
        int[] result = n1_TwoSum.twoSum(nums, target);
        int[] expected = {1,2};
        Assertions.assertArrayEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void testContainsDuplicate_3() {

        int[] nums = {3,3};
        int target = 6;
        int[] result = n1_TwoSum.twoSum(nums, target);
        int[] expected = {0,1};
        Assertions.assertArrayEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void testContainsDuplicate_FirstWrong() {

        // j should have = i+1 not a hardcoded 1
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result = n1_TwoSum.twoSum(nums, target);
        int[] expected = {1,2};
        Assertions.assertArrayEquals(result, expected);
    }
}