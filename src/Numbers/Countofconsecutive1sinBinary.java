// Task
// Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.

// Example

// The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .

// Input Format

// A single integer, .

// Constraints

// Output Format

// Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .

// Sample Input 1

// 5
// Sample Output 1

// 1
// Sample Input 2

// 13
// Sample Output 2

// 2
// Explanation

// Sample Case 1:
// The binary representation of  is , so the maximum number of consecutive 's is .

// Sample Case 2:
// The binary representation of  is , so the maximum number of consecutive 's is .
package Numbers;
import java.util.*;
public class Countofconsecutive1sinBinary {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i++){
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1; 
            if(tmpCount > maxCount){
                maxCount = tmpCount;
            }
        }
        System.out.println(maxCount);
    }
    
}
