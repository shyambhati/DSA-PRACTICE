package org.dsa.leetcode.mix;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,5,1,1,3};

        System.out.println(
                Arrays.toString(twoSum(nums, 8))
        );

        System.out.println(
                Arrays.toString(twoSumHashMap(nums, 8))
        );
    }
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[1];
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        int length = nums.length;

        HashMap<Integer, Integer> pairs = new HashMap<>()  ;
        for (int i = 0; i < length; i++) {

            int differance = target - nums[i];

            if (pairs.containsKey(differance))
                return new int[]{pairs.get(differance), i};

            pairs.put(nums[i], i);
        }
        return new int[]{};
    }
}
