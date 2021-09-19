package test.java.com.dbnaruto.leetcode;

import main.java.com.dbnaruto.leetcode.n88_MergedSortedArray;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

class n88_MergedSortedArrayTest {

    @org.junit.jupiter.api.Test
    void merge() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        n88_MergedSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Output: " + Arrays.toString(nums1));

        Assertions.assertArrayEquals(nums1, expected);
    }

    @org.junit.jupiter.api.Test
    void merge_2() {

        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        n88_MergedSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Output: " + Arrays.toString(nums1));

        Assertions.assertArrayEquals(nums1, expected);
    }

    @org.junit.jupiter.api.Test
    void merge_3() {

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        n88_MergedSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1};
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Output: " + Arrays.toString(nums1));

        Assertions.assertArrayEquals(nums1, expected);
    }

    @org.junit.jupiter.api.Test
    void merge_FirstWrong() {

        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = {1, 2, 3, 5, 6};
        int n = 5;
        n88_MergedSortedArray.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 3, 4, 5, 6};
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Output: " + Arrays.toString(nums1));

        Assertions.assertArrayEquals(nums1, expected);
    }
}