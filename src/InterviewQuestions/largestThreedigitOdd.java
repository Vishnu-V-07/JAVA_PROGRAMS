// 3.You are given a number.Find the largest three digit  
//Input:3001213
// Output:213
package InterviewQuestions;
import java.util.*;
public class largestThreedigitOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int max=0;
        for(int i=0;i<s1.length()-2;i++)
        {
            String s2=s1.substring(i,i+3);
            int n=Integer.parseInt(s2);
            if(n>max && n%2!=0)
            {
                max=n;
            }
        }
        System.out.println(max);


    }
    
}
