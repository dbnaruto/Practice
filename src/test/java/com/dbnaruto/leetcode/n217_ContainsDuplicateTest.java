package test.java.com.dbnaruto.leetcode;

import main.java.com.dbnaruto.leetcode.n217_ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class n217_ContainsDuplicateTest {

    @Test
    void testContainsDuplicate() {

        int[] nums = {1,2,3,1};
        boolean result = n217_ContainsDuplicate.containsDuplicate(nums);
        Assertions.assertTrue(result);
    }
}