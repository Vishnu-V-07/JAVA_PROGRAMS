package Patterns;
import java.util.*;
public class Xpattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int k=n-1-i;
           for(int j=0;j<n;j++)
           {
               if(i==k || j==k)
               {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
        }
    }
    
}
