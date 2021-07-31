package Patterns;
import java.util.*;
public class LessThan {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int count=0;
        for(int i=1;i<=iNum;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print(i+" ");
                    count++;
                }
                else{
                    System.out.print(" ");
                 
                }
                
            }
            System.out.println();
        }
        count=count+1;
        for(int i=iNum-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                {
                    System.out.print(count+" ");
                    count++;
                }
                else{
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
}

// 3
// 1
//  2
//   3
//  4
// 5