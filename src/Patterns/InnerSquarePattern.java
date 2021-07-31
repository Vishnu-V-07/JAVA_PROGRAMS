package Patterns;
import java.util.*;
class InnerSquarePattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        for(int i=1;i<=iNum;i++)
        {
           if(i==1 || i==iNum)
           {
               for(int j=1;j<=iNum;j++)
               {
                    if(j==1 || j==iNum)
                    {
                        System.out.print(i+" ");
                    }
                    else{
                        System.out.print(" ");
                    }
               }
               System.out.println();
           }
           else{
            
            for(int j=1;j<=iNum;j++)
            {
                 if(j==2 || j==iNum-1)
                 {
                     System.out.print(i+" ");
                 }
                 else{
                     System.out.print(" ");
                 }
            }
            System.out.println();
           }
        }
    }
}

// 4

// 1   1
//  2 2
//  3 3
// 4   4