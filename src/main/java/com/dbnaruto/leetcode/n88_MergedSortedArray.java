package main.java.com.dbnaruto.leetcode;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * Easy
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class n88_MergedSortedArray {
    //-------------------------------------------------------
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (m != 0) {
//            for (int i = 0; i < nums1.length - m; i++) {
//                nums1[i + m] = nums2[i];
//            }
//        } else {
//            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
//        }
//
//        Arrays.sort(nums1);

        // Is it lazy or is it smart to just simplify and use the built-in functions?
        // ¯\_(ツ)_/¯
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
    //-------------------------------------------------------
}