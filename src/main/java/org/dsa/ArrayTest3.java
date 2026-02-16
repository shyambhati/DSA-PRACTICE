package org.dsa;

public class ArrayTest3 {
    public static void main(String[] args) {

        //int[][] arr = new int[][]{ {23,43,45},{22,33,44},{66,55,22}  };

        int[][] arr = new int[][]{{11,22,33},{44,55,66},{77,88,99}  };
        int[][] transpose = new int[3][3];

        for(int[] row : arr) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

        System.out.println("#####################");

        int count = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = arr[i][j];
                count++;
            }
        }

      //  i = 0, j =1 ->  i = 1 , j =0

     //   int temp = arr


        System.out.println("Count = "+count);
        for(int[] row : transpose) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}


//23 43 45
//22 33 44
//66 55 22
//
//43 swap  22
//45 swap 66
//44 swap 55
//
//23 22 66
//43 33 55
//45 44 22
