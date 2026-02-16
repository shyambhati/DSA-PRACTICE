package org.dsa.scaler.Intermediate_DSA.Introduction_to_Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,7,4,9};

        System.out.println(
                Arrays.toString(reverseArray(arr))
        );

        System.out.println(
                Arrays.toString(reverseArrayTwoPointer(arr))
        );
    }

    // step 1
    // it has space issue and creating new array an iterating entire array
    static int[] reverseArray(int[] arr){

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            res[arr.length - (i+1)] = arr[i];

        return res;
    }

    // step 2
    // using two pinter replace each element
    // in this loop run half and space same
    static int[] reverseArrayTwoPointer(int[] arr){

        int length =arr.length ;

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[length -i -1] ;
            arr[length -i -1] = temp;
        }
        return arr;
    }
}
