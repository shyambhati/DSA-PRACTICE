package org.dsa.leetcode.twopointer;

public class ReverseString344 {
    public static void main(String[] args) {
        System.out.println(
                reverseString(
                        new char[]{'h','e','l','l','o'}
                )
        );

        char[] a = new char[]{'h','e','l','l','o'};
        System.out.println(
                reverseStringTwoPointer(
                      a
                )
        );

    }

    // step 1 brute force
    static char[] reverseString(char[] s) {
        char[] res = new char[s.length];

        for (int i = 0; i < s.length; i++)
            res[s.length - (i+1)] = s[i];

        return res;
    }

    // step 2 , using two pointer
    static char[] reverseStringTwoPointer(char[] s) {


        for (int i = 0; i < s.length/2; i++){
            char ch = s[i];
            s[i] = s[s.length -i -1];
            s[s.length -i -1] = ch;
        }
        return s;
    }
}
