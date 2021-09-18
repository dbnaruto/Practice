package main.java.com.dbnaruto.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 53. Maximum Subarray
 * Easy
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */

public class n53_MaximumSubarray {
    //-------------------------------------------------------
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        if(nums.length > 1) {
            for (int i = 0; i<nums.length; i++) {
                currentSum += nums[i];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if(currentSum < 0){
                    currentSum = 0;
                }
            }
        } else if(nums.length == 1) {
            return nums[0];
        }
        return maxSum;
    }
    //-------------------------------------------------------
}