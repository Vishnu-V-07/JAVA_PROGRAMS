// Lexi string
// Sample Output
// 3
// 1Little Jill jumbled up the order of the letters in our dictionary. Now, Jack uses this list to nd the smallest lexicographical string that
// can be made out of this new order. Can you help him?
// You are given a string P that denotes the new order of letters in the English dictionary.
// You need to print the smallest lexicographic string made from the given string S.
// Input Format
// The rst line contains numbers of test cases, T
// The second line has the string P
// The third line has the string S
// Output Format
// Print a single string in a new line for every test case giving the result

// Constraints
// 1 <= T <= 1000
// Length (P) = 26
// 1 <= length (S) <= 100
// All characters in the string S, P are in lowercase
// For example,
// Input:
// 2
// poliktgbvfredcxwqaz
// abcd
// qwryupcsfoghjkldezxvbintma
// ativedoc
// Output:
// bdca
// codevita
// Explanation:
// The transformed smallest lexicographical strings are in order they would be if order of letters are changed to string P.
// Sample Input
// 2
// poliktgbvfredcxwqaz
// abcd
// qwryupcsfoghjkldezxvbintma

// Sample Output
// bdca
// codevita

package Strings;

import java.util.*;

public class LexiString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        String s3 = "";

        for (int i = 0; i < iNum; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            s3 = "";

            for (int k = 0; k < s1.length(); k++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(k) == s2.charAt(j)) {
                        s3 += String.valueOf(s1.charAt(k));
                    }
                }
            }
            System.out.println(s3);

        }
    }
}