// 1.Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

// Example 1:

// Input:
// a = amazon
// b = azonam
// Output: 1
// Explanation: amazon can be rotated anti
// clockwise by two places, which will make
// it as azonam.
// Example 2:

// Input:
// a = geeksforgeeks
// b = geeksgeeksfor
// Output: 0
// Explanation: If we rotate geeksforgeeks by
// two place in any direction , we won't get
// geeksgeeksfor.
package InterviewQuestions;
import java.util.*;
public class StringRotationByTwoPlaces {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        String s3=s1.substring(2)+s1.substring(0,2);
        String s4=s1.substring(s1.length()-2, s1.length()) +s1.substring(0, s1.length()-2) ;
        if(s3.equals(s2) || s4.equals(s2))
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    
}
