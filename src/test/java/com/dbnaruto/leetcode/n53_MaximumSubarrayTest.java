package test.java.com.dbnaruto.leetcode;

import main.java.com.dbnaruto.leetcode.n53_MaximumSubarray;
import org.junit.jupiter.api.Assertions;

class n53_MaximumSubarrayTest {

    @org.junit.jupiter.api.Test
    void testContainsDuplicate() {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = n53_MaximumSubarray.maxSubArray(nums);
        Assertions.assertEquals(result, 6);
    }

    @org.junit.jupiter.api.Test
    void testContainsDuplicate_2() {

        int[] nums = {1};
        int result = n53_MaximumSubarray.maxSubArray(nums);
        Assertions.assertEquals(result, 1);
    }

    @org.junit.jupiter.api.Test
    void testContainsDuplicat3_3() {

        int[] nums = {5,4,-1,7,8};
        int result = n53_MaximumSubarray.maxSubArray(nums);
        Assertions.assertEquals(result, 23);
    }
}