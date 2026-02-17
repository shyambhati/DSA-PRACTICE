package org.dsa.common;

public class PrefixSumBasic {


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 5};

        // prefix summ array
        int[] prefixSum = new int[arr.length +1];

        for (int i = 1; i<=arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] +arr[i-1];
        }

        System.out.println(
                rangeSum(prefixSum, 0, 2)
        );

        System.out.println(
                rangeSum(prefixSum, 1, 2)
        );
    }

    // we need prefix sum  when we need to handle multiple range sum queries efficiently.
    // for prefix sum we create a new array as same size of input or +1 size

    public static int rangeSum(int[] prefix, int L, int R) {

        if (L == 0) {
            return prefix[R];
        }

        return prefix[R+1] - prefix[L];
    }

}
