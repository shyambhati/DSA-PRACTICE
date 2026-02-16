package org.dsa;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Hello");



        int data[] = new int[5];



        data[0] = 20;
        data[1] = 35;
        data[2] = 40;
        data[3] = 55;
        data[4] = 10;


        for (int i = 0; i < data.length; i++){
           // System.out.println( data[i] );
        }


        System.out.println("#####################");

        int table[] = new int[10];

        int num = 2;
        for (int i = 1; i <= table.length; i++){
            table[i - 1] = i * num;
        }

        printTable(table);
    }


    static void printTable(int[] t){

        for (int i = 0; i < t.length; i++){
            System.out.println( t[i] );
        }
    }
}
