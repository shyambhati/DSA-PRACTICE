package org.dsa.leetcode.mix;


//Given an array of integers nums, return the number of good pairs.

import java.util.HashMap;

////A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
public class GoodPair1512 {
    public static void main(String[] args) {

        int nums[] = new int[]{1,2,3,5,1,1,3};
        int nums2[] = new int[]{1,1,1,1};
        System.out.println(
                numIdenticalPairs(nums)
        );

        System.out.println(
                numIdenticalPairs(nums2)
        );

        System.out.println(
                numIdenticalPairsHashmap(nums)
        );
    }

    public static int numIdenticalPairs(int[] nums) {

        int count = 0;
        int len = nums.length;
        for(int i =0; i < len; i++){
            for (int j = i +1; j<len; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int numIdenticalPairsHashmap(int[] nums) {

        int count = 0;
        int len = nums.length;
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for(int i = 0; i < len; i++){
            if (pairs.containsKey(nums[i])){
                count+=pairs.get(nums[i]);
            }
            pairs.put(nums[i], pairs.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
