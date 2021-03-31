// Problem Statement:
// Balls for Challenge

// The Circoloco Children Carnival is the City’s largest and successful event dedicated to children and families. The main focus at the carnival is the workshop arena where kids can participate in engaging and educational activities.

// Charlie, a little boy accompanied by his Mom visited the fair, where he participated at the "Balls for Challenge" activity. He was given many balls of white and black colors. During the play, he arranged the balls into two rows both consisting of N number of balls. These two rows of balls are given to you in the form of strings X, Y. Both these string consist of 'W' and 'B', where 'W' denotes a white colored ball and 'B' a black colored.

// Other than these two rows of balls, Charlie has an infinite supply of extra balls of each color. He wants to create another row of N balls, Z in such a way that the sum of hamming distance between X and Z, and hamming distance between Y and Z is maximized.

// Hamming Distance between two strings X and Y is defined as the number of positions where the color of balls in row X differs from the row Y ball at that position. e.g. hamming distance between "WBB", "BWB" is 2, as at position 1 and 2, corresponding colors in the two strings differ. As there can be multiple such arrangements of row Z, Charlie wants you to find the lexicographically smallest arrangement which will maximize the above value.

// Input Format
// First line of the input will contain a string X denoting the arrangement of balls in first row.

// Second line of the input will contain the string Y denoting the arrangement of balls in second row.

// Output Format
// Output a single line containing the string of length N denoting the arrangement of colors of the balls belonging to row Z.

// Refer sample input and output for formatting specifications.

// Sample Input 1
// WBWB
// WBBB
// Sample Output 1
// BWWW
// Sample Input 2
// BBBW
// BWBB
// Sample Output 2
// WBWB
// Sample Input 3
// WWWW
// BBBB
// Sample Output 3
// WBWB
package Strings;

import java.util.*;

public class HammingDistance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String sArr[] = new String[s1.length()];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                if (s1.charAt(i) == 'W') {
                    sArr[i] = "B";
                } else if (s1.charAt(i) == 'B') {
                    sArr[i] = "W";
                }
            } else {
                if (count % 2 == 0) {
                    sArr[i] = String.valueOf(s1.charAt(i));
                } else {
                    sArr[i] = String.valueOf(s2.charAt(i));
                }
                count++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(sArr[i]);
        }
        sc.close();
    }
}
