// Recursive Method for Calculating Factorial
// Function Description
// Complete the factorial function in the editor below. Be sure to use recursion.

// factorial has the following paramter:

// int n: an integer
// Returns

// int: the factorial of 
// Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of .

// Input Format

// A single integer,  (the argument to pass to factorial).

// Constraints

// Your submission must contain a recursive function named factorial.
// Sample Input

// 3
// Sample Output

// 6
// Explanation

// Consider the following steps. After the recursive calls from step 1 to 3, results are accumulated from step 3 to 1.
package Numbers;
import java.util.*;
public class Factorial {
    static int factorial(int n) {
        return (n > 1) ? n * factorial(n-1) : 1;
       }
       public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           int n = sc.nextInt();
        
   
           int result = factorial(n);
   
           System.out.println(result);
   
           sc.close();
       }
   }
   

