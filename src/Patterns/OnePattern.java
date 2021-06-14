package Patterns;
import java.util.*;
public class OnePattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        int k=1;int m=1;
        for(int i=1;i<=iNum;i++)
        {
             for(int j=1;j<=m;j++)
             {
                System.out.print(k+" ");
             }
             m+=2;
             System.out.println();
        }
    }
}


// I/P:

// 5

// O/P:

// 1
// 1 1 1
// 1 1 1 1 1
// 1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1