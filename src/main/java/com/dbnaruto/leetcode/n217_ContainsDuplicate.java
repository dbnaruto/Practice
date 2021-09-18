package main.java.com.dbnaruto.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Easy
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

public class n217_ContainsDuplicate {
    //-------------------------------------------------------
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();

        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (numsSet.add(nums[i])) {
                    numsSet.add(nums[i]);
                } else {
                    return true;
                }
            }
        } else {
            // 1 or 0 values in array so there can't be a match
            return false;
        }
        return false;
    }
    //-------------------------------------------------------
}