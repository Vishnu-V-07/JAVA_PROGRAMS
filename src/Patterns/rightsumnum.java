// 2.PRINT THE PROGRAM
// I/P:5
// O/P:
// 1
// 2 7
// 3 8 13
// 4 9 14 19
// 5 10 15 20 25

package Patterns;
import java.util.*;
public class rightsumnum {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner( System.in);
        int iNum=sc.nextInt();
        int k=1;
        int l=0;
        for(int i=1;i<=iNum;i++)
        {
            l=k;
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print(k+" ");
                    k++;
                }
                else{
                    l=l+iNum;
                    System.out.print(l+" ");
                }
            }
            System.out.println();
        }
    }
}
