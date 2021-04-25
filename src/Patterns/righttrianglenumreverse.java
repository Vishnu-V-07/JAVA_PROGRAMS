// JAVA PROGRAM TO PRINT THE PATTERN 
// I/P: 5
// O/P:
// 1
// 3 2
// 4 5 6
// 10 9 8 7
// 11 12 13 14 15
package Patterns;
import java.util.*;
public class righttrianglenumreverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1,l=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                l=k+i-1;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(l+" ");
                    l--;
                    k++;
                }
            }
            else{
                l=k;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(l+" ");
                    l++;
                    k++;
                }
            }
           
            System.out.println();
        }
    }
    
}
