package Patterns;
import java.util.*;
class RightLowerTriangle
{
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);
        int iNum=sc.nextInt();
        for(int i=iNum;i>=1;i--)
        {
            char a=97;
            for(int j=iNum;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        
    }
     
}