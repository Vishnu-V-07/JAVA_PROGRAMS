// Similar char
// Tahir and Mamta are working on a project in TCS. Tahir being a problem solver came up with an interesting problem for his friend
// Mamta. The problem consists of a string of length N and contains only small case alphabets.
// It will be followed by Q queries, in which each query will contain an integer P (1<=P<=N) denoting a position within the string.
// Mamta's task is to nd the alphabet present at that location and determine the number of occurrences of the same alphabet
// preceding the given location P.
// Mamta is busy with her of ce work. Therefore, she asked you to help her.
// Input Format
// First-line contains an integer N, denoting the length of the string.
// Second-line contains string S itself consists of small case alphabets only ('a' - 'z').
// The third line contains an integer Q denoting the number of queries that will be asked.
// Next, Q lines contain an integer P (1 <= P <= N) for which you need to nd the number occurrence of character present at the Pth location
// preceding P
// Output Format
// For each query, print an integer denoting the answer on a single line.
// Constraints
// 1 <= N <= 500000
// S consisting of small case alphabets
// 1 <= Q <= 10000
// 1 <= P <= N
// For example,
// Input:
// 9
// abacsddaa
// 2
// 9
// 3
// Output:
// 3
// 1
// Explanation:
// Here Q = 2
// For P=9, the character at the 9th location is 'a'. The number of occurrences of 'a' before P i.e., 9 is three.
// Similarly, for P=3, 3rd character is 'a'. The number of occurrences of 'a' before P. i.e., 3 is one.
// Sample Input
// 9
// abacsddaa
// 2
// 9

package Strings;

import java.util.*;

public class SimilarChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        String s1 = sc.next();
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            char ch = s1.charAt(b - 1);
            count = 0;
            for (int j = 0; j < b - 1; j++) {
                if (s1.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
