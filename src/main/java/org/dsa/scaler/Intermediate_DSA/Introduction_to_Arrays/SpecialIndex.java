package org.dsa.scaler.Intermediate_DSA.Introduction_to_Arrays;

import java.util.Arrays;

public class SpecialIndex {

    // given an array of size n, count the number of special index in the array.
    // Note: Special index are those removing which, sum of all EVEN indexes and sum of ODD indexes are equals.

    public static void main(String[] args) {

         int[] arr = {2,3,2,4,5};
        System.out.println(
                checkSpecialIndex(arr)
        );
        System.out.println("###############");
        System.out.println(
                checkSpecialIndex_1(arr)
        );
    }

    // using new array
    // brute force
    static int checkSpecialIndex(int arr[]){


        int totalSpecialIndexes = 0;

        int n = arr.length;

        int temp[] = new int[n - 1];

        for(int i = 0; i < n; i++){
           // System.out.println(Arrays.toString(arr));
            for(int j = 0; j < temp.length; j++){
                if(i <= j)
                    temp[j] = arr[j+1];
                else
                    temp[j] = arr[j];
            }
          //  System.out.println( // Arrays.toString(temp) );
          //  System.out.println();

            if (checkEvenOddSum(temp))
                totalSpecialIndexes++;
        }
        return  totalSpecialIndexes;
    }


    // using prefix sum
    static int checkSpecialIndex_1(int arr[]) {


        int totalSpecialIndexes = 0;

        int n = arr.length;

        int evenPrefixSum[] = new int[n];
        int oddPrefixSum[] = new int[n];
        evenPrefixSum[0] = arr[0];
        oddPrefixSum[0] = 0;
        for (int i = 1; i < n; i++){
            // even
            if(i % 2 == 0)
                evenPrefixSum[i] = evenPrefixSum[i - 1] + arr[i];
            else
                evenPrefixSum[i] = evenPrefixSum[i - 1];

            // odd
            if(i % 2 != 0)
                oddPrefixSum[i] = oddPrefixSum[i - 1] + arr[i];
            else
                oddPrefixSum[i] = oddPrefixSum[i - 1];
        }

        System.out.println(
                Arrays.toString(arr)
        );

        System.out.println(
                Arrays.toString(evenPrefixSum)
        );

        System.out.println(
                Arrays.toString(oddPrefixSum)
        );

        for(int i = 0; i < n; i++){
            int even;
            int odd;
            if(i == 0 ){
                even = oddPrefixSum[n-1] - oddPrefixSum[i];
                odd = evenPrefixSum[n-1] - evenPrefixSum[i];
            }
            else {
                 even = evenPrefixSum[i - 1]  + (oddPrefixSum[n - 1] - oddPrefixSum[i]) ;
                 odd = oddPrefixSum[i - 1]  + (evenPrefixSum[n - 1] - evenPrefixSum[i]);
            }

            System.out.println("EVEN : "+even+" ODD : "+odd);
            if (even == odd) {
                totalSpecialIndexes++;
            }
        }
        return totalSpecialIndexes;
    }

    static int getSum(int[] prefixSum, int L, int R){
        if(L ==0)
            return prefixSum[R];
        return prefixSum[R] - prefixSum[L - 1];
    }


    static boolean checkEvenOddSum(int arr[]){
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0)
                evenSum +=  arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("EVEN : "+evenSum+" ODD : "+oddSum);
        return oddSum == evenSum;
    }
}
