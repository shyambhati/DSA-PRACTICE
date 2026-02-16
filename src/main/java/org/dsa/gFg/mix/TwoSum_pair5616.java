package org.dsa.gFg.mix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum_pair5616 {
    public static void main(String[] args) {
        int nums[] = new int[]{0, -1, 2, -3, 1};

        System.out.println(
              twoSum(nums, 2)
        );

        int nums2[] = new int[]{1, -2, 1, 0, 5};

        System.out.println(
                twoSum(nums2, 0)
        );
    }

    static  boolean  twoSum(int arr[], int target) {

        int length = arr.length;

        Set<Integer> pairs = new HashSet<>();

        for (int i =0; i<length; i++){

            int diffreance = target- arr[i];
            if (pairs.contains(diffreance))
                return true;
            pairs.add(arr[i]);
        }
        return false;
    }
}
