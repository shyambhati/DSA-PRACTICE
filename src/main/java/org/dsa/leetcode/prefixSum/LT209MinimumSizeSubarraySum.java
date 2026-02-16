package org.dsa.leetcode.prefixSum;

public class LT209MinimumSizeSubarraySum {
    public static void main(String[] args) {

        int target = 7;
        int[] nums = new int[]{2,3,1,2,4,3};

        System.out.println(
                minSubArrayLen(target,nums)
        );
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int len = nums.length;
        int minLen=Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                if(sum >= target){
                    sum += nums[j];

                    if (sum >= target) {
                        minLen = Math.min(minLen, j - i + 1);
                        break; // aage aur bada subarray hoga
                    }
                }

            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
