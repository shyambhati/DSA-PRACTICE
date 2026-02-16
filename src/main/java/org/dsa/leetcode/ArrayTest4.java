package org.dsa.leetcode;

public class ArrayTest4 {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{11,22,33},{44,55,66},{77,88,99}  };


        for(int[] row : arr) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
        System.out.println("#########");
        // //  i = 0, j =1 ->  i = 1 , j =0
        int temp = arr[0][1];
        arr[0][1] = arr[1][0];
        arr[1][0] = temp;


        temp = arr[0][2];
        arr[0][2] = arr[2][0];
        arr[2][0] = temp;


        temp = arr[1][2];
        arr[2][1] = arr[1][1];
        arr[1][2] = temp;


        for(int[] row : arr) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

    }
}
