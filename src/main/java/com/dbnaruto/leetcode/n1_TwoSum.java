package main.java.com.dbnaruto.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * Easy
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class n1_TwoSum {
    //-------------------------------------------------------
    public static int[] twoSum(int[] nums, int target) {
//        for(int i = 0; i < nums.length; i++) {
//            if (Math.abs(i) < Math.abs(target) || 0 == target) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        return new int[]{i, j};
//                    }
//                }
//            }
//        }
//        return new int[0];

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int remainder = target - number;
            if (numsMap.containsKey(remainder)) {
                int remainderIndex = numsMap.get(remainder);
                if (remainderIndex == i) continue;
                return new int[]{i, remainderIndex};
            }
        }


        return new int[0];
    }
    //-------------------------------------------------------
}