// 2.You are given a number.Find the largest three digit Integer
// Input:3001213
// Output:213
package InterviewQuestions;

import java.util.*;
public class largestThreeDigitNumber {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int l=0,rem=0;
    while(iNum>0)
    {
         rem=iNum%1000;
         if(rem>l)
         {
               l=rem;
               
         }
         iNum/=10;
    
       
    }
    System.out.println(l);
    
}

    
}
