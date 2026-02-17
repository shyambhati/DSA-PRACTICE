package org.dsa.scaler.Intermediate_DSA.Introduction_to_Arrays;

/*
    ============================================================
    🧩 Problem: Count Character Pairs Using Carry Forward
    ============================================================

    Given a string S consisting of lowercase English letters
    and two characters L and R,

    Count the number of pairs (i, j) such that:

        1) S[i] == L
        2) S[j] == R
        3) i < j

    Return the total number of valid pairs.

    ------------------------------------------------------------
    📌 Example:

    Input:
        S = "abcgsdawg"
        L = 'a'
        R = 'g'

    Output:
        3

    Explanation:
        Valid pairs:
        (0,3), (0,8), (6,8)

    ------------------------------------------------------------
    📎 Constraints:

        1 ≤ S.length ≤ 10^5
        S contains lowercase English letters only
        L and R are lowercase English letters

    ------------------------------------------------------------
    🎯 Expected Complexity:

        Brute Force  -> O(n²)
        Optimized    -> O(n)

    ------------------------------------------------------------
    🧪 Test Cases:

    1) S = "abcgsdawg", L='a', R='g'  -> Output: 3
    2) S = "aaaa", L='a', R='g'       -> Output: 0
    3) S = "aaggg", L='a', R='g'      -> Output: 6
    4) S = "a", L='a', R='g'          -> Output: 0
    5) S = "", L='a', R='g'           -> Output: 0

    ⚠ Note:
       If L == R, special handling is required.
       Example:
       S = "aaaa"
       Total pairs = 6
       pair will be total subarray = n(n - 1)/2 => 4 x 3 / 2 => 12 / 2 = 6

*/

public class PairCount_CarryForward {

    public static void main(String[] args) {

        // Test Case 1
        System.out.println(countPair("abcgsdawg",'a','g'));             // 3
        System.out.println(countPairCarryForward("abcgsdawg",'a','g')); // 3

        // Test Case 2
        System.out.println(countPairCarryForward("aaaa",'a','g')); // 0

        // Test Case 3
        System.out.println(countPairCarryForward("aaggg",'a','g')); // 6

        // Test Case 4
        System.out.println(countPairCarryForward("a",'a','g')); // 0

        // Test Case 5
        System.out.println(countPairCarryForward("",'a','g')); // 0

        System.out.println(countPairCarryForward("aaaa",'a','a')); // 6
    }

    // Brute Force Technique
    // Time Complexity: O(n²)
    static int countPair(String s, char L , char R) {
        int count = 0;

        if(s == null || s.isEmpty() )
            return 0;

        int n = s.length();
        if(n ==0)
            return 0;
        if(L == R)
            return n*(n-1)/2;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == L) {
                for(int j = i + 1; j < n; j++){
                    if(s.charAt(j) == R){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Carry Forward Technique (Optimized)
    // Time Complexity: O(n)
    static int countPairCarryForward(String s, char L , char R) {

        int countR = 0;
        int result = 0;

        if(s == null || s.isEmpty() )
            return 0;

        int n = s.length();

        if(L == R)
            return n*(n-1)/2;

        for(int i = n - 1; i >= 0; i--) {

            if(s.charAt(i) == R) {
                countR++;
            }
            else if(s.charAt(i) == L) {
                result += countR;
            }
        }
        return result;
    }
}
